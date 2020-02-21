package com.java.practise.kingdom.core;

import com.java.practise.kingdom.constant.KingdomConstants;
import com.java.practise.kingdom.enums.Gender;
import com.java.practise.kingdom.enums.RelationOfKing;
import com.java.practise.kingdom.relation.RelationContext;

import java.util.ArrayList;
import java.util.List;

public class KingsFamilyManagerImpl implements KingsFamilyManager {
    @Override
    public String addChildToFamily(String motherName, String childName, Gender gender) {
        List<KingsFamilyPerson> kingsFamilyPersonList = new ArrayList<>();
        kingsFamilyPersonList.add(KingsFamilyTree.getKingsFamilyTreeInstance());

        while (!kingsFamilyPersonList.isEmpty()){
            KingsFamilyPerson kingsFamilyPerson = kingsFamilyPersonList.remove(0);
            if (kingsFamilyPerson.getFather() != null && kingsFamilyPerson.getFather().getName().equalsIgnoreCase(motherName)){
                return KingdomConstants.CHILD_ADDITION_FAILED;
            }
            if (kingsFamilyPerson.getMother() != null && kingsFamilyPerson.getMother().getName().equalsIgnoreCase(motherName)){
                Person person = new Person(childName,gender);
                KingsFamilyPerson kid = new KingsFamilyPerson();
                if (gender == Gender.Male){
                    kid.setFather(person);
                    kid.setRelationOfKing(RelationOfKing.Father);
                }else {
                    kid.setMother(person);
                    kid.setRelationOfKing(RelationOfKing.Mother);
                }
                kid.setKids(new ArrayList<>());
                kingsFamilyPerson.getKids().add(kid);
                return KingdomConstants.CHILD_ADD_SUCCESSFUL;
            }
            kingsFamilyPersonList.addAll(kingsFamilyPerson.getKids());
        }
        return KingdomConstants.PERSON_NOT_FOUND;
    }

    @Override
    public void addSpouseDetails(String kingsRelationPersonName, String spouseName, Gender gender) {
        List<KingsFamilyPerson> kingsFamilyPersonList = new ArrayList<>();
        kingsFamilyPersonList.add(KingsFamilyTree.getKingsFamilyTreeInstance());

        while (!kingsFamilyPersonList.isEmpty()){
            KingsFamilyPerson kingsFamilyPerson = kingsFamilyPersonList.remove(0);
            Person person =  new Person(spouseName,gender);
            if (kingsFamilyPerson.getFather() != null && kingsFamilyPerson.getFather().getName().equals(kingsRelationPersonName)){
                kingsFamilyPerson.setMother(person);
            }else if (kingsFamilyPerson.getMother() != null && kingsFamilyPerson.getMother().getName().equals(kingsRelationPersonName)){
                kingsFamilyPerson.setFather(person);
            }
            kingsFamilyPersonList.addAll(kingsFamilyPerson.getKids());
        }
    }

    @Override
    public List<String> getRelation(String name, String relationShip) {
        return RelationContext.getRelationName(name, relationShip);
    }
}

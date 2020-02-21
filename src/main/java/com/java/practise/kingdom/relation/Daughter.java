package com.java.practise.kingdom.relation;

import com.java.practise.kingdom.Util.RelationUtils;
import com.java.practise.kingdom.core.KingsFamilyPerson;
import com.java.practise.kingdom.enums.RelationOfKing;

import java.util.*;

public class Daughter implements Relation {

    @Override
    public List<String> getRelationDetails(String name) {
        List<KingsFamilyPerson> kingsFamilyPeople = RelationUtils.getKingsFamilyTreeAndKingsRelationList(name);
        while (!kingsFamilyPeople.isEmpty()){
            KingsFamilyPerson kingsFamilyPerson = kingsFamilyPeople.remove(0);
            if (( kingsFamilyPerson.getFather()!= null && name.equalsIgnoreCase(kingsFamilyPerson.getFather().getName()))
                    || (kingsFamilyPerson.getMother() != null && name.equalsIgnoreCase(kingsFamilyPerson.getMother().getName()))){
                return getDaughterNames(kingsFamilyPerson.getKids());
            }
            kingsFamilyPeople.addAll(kingsFamilyPerson.getKids());
        }
        return Collections.emptyList();
    }

    private List<String> getDaughterNames(List<KingsFamilyPerson> kingsFamilyPersonList) {
        List<String> daughterNames = new ArrayList<>();
        for(KingsFamilyPerson kingsFamilyPerson:kingsFamilyPersonList){
            if (kingsFamilyPerson.getRelationOfKing().equals(RelationOfKing.Mother)){
                daughterNames.add(kingsFamilyPerson.getMother().getName());
            }
        }
        return daughterNames;
    }
}

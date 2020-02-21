package com.java.practise.kingdom.Util;

import com.java.practise.kingdom.core.KingsFamilyPerson;
import com.java.practise.kingdom.core.KingsFamilyTree;
import com.java.practise.kingdom.enums.Gender;
import com.java.practise.kingdom.enums.RelationOfKing;

import java.util.*;
import java.util.stream.Collectors;

public class RelationUtils {

    public static List<KingsFamilyPerson> getKingsFamilyTreeAndKingsRelationList(String searchingName) {
        List<KingsFamilyPerson> kingsFamilyPeople = new ArrayList<>();
        KingsFamilyPerson king = KingsFamilyTree.getKingsFamilyTreeInstance();
        if (king.getFather().getName().equals(searchingName) || king.getMother().getName().equals(searchingName)) {
            return Collections.emptyList();
        }
        kingsFamilyPeople.add(king);
        return kingsFamilyPeople;
    }

    public static List<String> getKidsNames(List<KingsFamilyPerson> kids, String name ,List<Gender> genders) {
        List<String> kidsNames = new ArrayList<>();
        for (KingsFamilyPerson kid : kids) {
            if (kid.getRelationOfKing().equals(RelationOfKing.Father) && genders.contains(kid.getFather().getGender())) {
                kidsNames.add(kid.getFather().getName());
            } else if (kid.getRelationOfKing().equals(RelationOfKing.Mother) &&
                    genders.contains(kid.getMother().getGender())) {
                kidsNames.add(kid.getMother().getName());
            } else if ((kid.getFather() != null && kid.getFather().getName().equals(name))||
                    (kid.getMother() != null && kid.getMother().getName().equals(name))){
                if (kid.getRelationOfKing().equals(RelationOfKing.Father)){
                    kidsNames.add(kid.getFather().getName());
                }else{
                    kidsNames.add(kid.getMother().getName());
                }
            }
        }
        return kidsNames;
    }

    public static List<KingsFamilyPerson> excludeNameFromList(List<KingsFamilyPerson> kingsFamilyPersonList, String nameToExclude) {

        return kingsFamilyPersonList.stream().filter(kingsFamilyPerson -> (kingsFamilyPerson.getFather() != null
                && !kingsFamilyPerson.getFather().getName().equals(nameToExclude)) || (kingsFamilyPerson.getMother() != null
                && !kingsFamilyPerson.getMother().getName().equals(nameToExclude))).collect(Collectors.toList());
    }

    public static List<String> getSpouse(List<KingsFamilyPerson> kingsFamilyPersonList, String nameToExclude, Gender gender) {
        List<String> spouse = new ArrayList<>();
        kingsFamilyPersonList = excludeNameFromList(kingsFamilyPersonList, nameToExclude);
        for (KingsFamilyPerson kingsFamilyPerson : kingsFamilyPersonList) {
             if (kingsFamilyPerson.getRelationOfKing().equals(RelationOfKing.Father) &&
                     kingsFamilyPerson.getMother() != null && kingsFamilyPerson.getMother().getGender().equals(gender)){
                 spouse.add(kingsFamilyPerson.getMother().getName());
             }else if (kingsFamilyPerson.getRelationOfKing().equals(RelationOfKing.Mother) &&
                     kingsFamilyPerson.getFather() != null && kingsFamilyPerson.getFather().getGender().equals(gender)){
                 spouse.add(kingsFamilyPerson.getFather().getName());
             }
        }
        return spouse;
    }
}

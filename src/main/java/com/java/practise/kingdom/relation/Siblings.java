package com.java.practise.kingdom.relation;

import com.java.practise.kingdom.Util.RelationUtils;
import com.java.practise.kingdom.core.KingsFamilyPerson;
import com.java.practise.kingdom.enums.Gender;

import java.util.*;

public class Siblings implements Relation {

    @Override
    public List<String> getRelationDetails(String name) {
        return getSiblings(name, Arrays.asList(Gender.values()));
    }

     List<String> getSiblings(String name, List<Gender> genders) {
        List<KingsFamilyPerson> kingsFamilyPeople = RelationUtils.getKingsFamilyTreeAndKingsRelationList(name);
        while (!kingsFamilyPeople.isEmpty()) {
            KingsFamilyPerson kingsFamilyPerson = kingsFamilyPeople.remove(0);
            List<String> kidsList = RelationUtils.getKidsNames(kingsFamilyPerson.getKids(), name ,genders);
            if (kidsList.contains(name)) {
                kidsList.remove(name);
                return kidsList;
            }
            if (kingsFamilyPerson.getKids() != null && !kingsFamilyPerson.getKids().isEmpty()) {
                kingsFamilyPeople.addAll(kingsFamilyPerson.getKids());
            }
        }
        return Collections.emptyList();
    }
}

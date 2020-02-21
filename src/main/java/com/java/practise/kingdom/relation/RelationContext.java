package com.java.practise.kingdom.relation;

import java.util.*;

public class RelationContext {

    private static Map<String,Relation> relationshipRelationMap = new HashMap<>();

    private RelationContext(){}

    static {
        relationshipRelationMap.put(Relationship.Son.getValue(),new Son());
        relationshipRelationMap.put(Relationship.Daughter.getValue(), new Daughter());
        relationshipRelationMap.put(Relationship.Siblings.getValue(), new Siblings());
        relationshipRelationMap.put(Relationship.MaternalAunt.getValue(), new MaternalAunt());
        relationshipRelationMap.put(Relationship.PaternalAunt.getValue(), new PaternalAunt());
        relationshipRelationMap.put(Relationship.MaternalUncle.getValue(), new MaternalUncle());
        relationshipRelationMap.put(Relationship.PaternalUncle.getValue(), new PaternalUncle());
        relationshipRelationMap.put(Relationship.BrotherInLaw.getValue(), new BrotherInLaw());
        relationshipRelationMap.put(Relationship.SisterInLaw.getValue(), new SisterInLaw());
    }

    public static List<String> getRelationName(String name,String relationship){
        return relationshipRelationMap.get(relationship).getRelationDetails(name);
    }
}

package com.java.practise.kingdom.core;

public class KingsFamilyTree {

    private static KingsFamilyPerson kingsFamilyHierarchy;

    private KingsFamilyTree(){}

    public static KingsFamilyPerson getKingsFamilyTreeInstance() {
        if (kingsFamilyHierarchy == null) {
            kingsFamilyHierarchy = new KingsFamilyPerson();
        }
        return kingsFamilyHierarchy;
    }

    static KingsFamilyPerson getKingsFamilyTreeInstance(KingsFamilyPerson kingsFamilyPerson) {
        if (kingsFamilyHierarchy == null) {
            kingsFamilyHierarchy = kingsFamilyPerson;
        }
        return kingsFamilyHierarchy;
    }
}

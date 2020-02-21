package com.java.practise.kingdom.core;

import com.java.practise.kingdom.enums.Gender;

import java.util.List;

public interface KingsFamilyManager {

    String addChildToFamily(String motherName, String childName, Gender gender);

    void addSpouseDetails(String kingsRelationPersonName, String spouseName, Gender gender);

    List<String> getRelation(String name, String relationShip);
}

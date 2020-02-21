package com.java.practise.kingdom.core;

import com.java.practise.kingdom.enums.RelationOfKing;

import java.util.ArrayList;
import java.util.List;

public class KingsFamilyPerson {

    private Person father;

    private Person mother;

    private RelationOfKing relationOfKing;

    private List<KingsFamilyPerson> kids;

    public KingsFamilyPerson(Person father, Person mother, RelationOfKing relationOfKing) {
        this.father = father;
        this.mother = mother;
        this.relationOfKing = relationOfKing;
        this.kids = new ArrayList<>();
    }

    public KingsFamilyPerson() {
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public RelationOfKing getRelationOfKing() {
        return relationOfKing;
    }

    public void setRelationOfKing(RelationOfKing relationOfKing) {
        this.relationOfKing = relationOfKing;
    }

    public List<KingsFamilyPerson> getKids() {
        return kids;
    }

    public void setKids(List<KingsFamilyPerson> kids) {
        this.kids = kids;
    }
}

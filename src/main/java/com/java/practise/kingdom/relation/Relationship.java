package com.java.practise.kingdom.relation;

public enum Relationship {

    Son("Son"),
    Daughter("Daughter"),
    Siblings("Siblings"),
    BrotherInLaw("Brother-In-Law"),
    SisterInLaw("Sister-In-Law"),
    MaternalAunt("Maternal-Aunt"),
    PaternalAunt("Paternal-Aunt"),
    MaternalUncle("Maternal-Uncle"),
    PaternalUncle("Paternal-Uncle");

    public String getValue() {
        return value;
    }

    public String value;

    Relationship(String value) {
        this.value = value;
    }
}

package com.java.practise.java;

import java.util.*;

public class ComparatorExample {

    private static void display(List<NewPerson> personList) {
        for (NewPerson person : personList) {
            System.out.println("Name : " + person.name + "\t Age : " + person.age);
        }
    }

    public static void main(String[] args) {
        List<NewPerson> personList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            personList.add(new NewPerson(new Random().nextInt(99), "Person" + i));
        }
        System.out.println("===Before sort====");
        display(personList);
        System.out.println("===After sort====");
        Collections.sort(personList, new PersonComparator());
        display(personList);
    }
}

class NewPerson {
    int age;
    String name;

    public NewPerson(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

class PersonComparator implements Comparator<NewPerson> {

    @Override
    public int compare(NewPerson o1, NewPerson o2) {
        if (o1.age > o2.age) {
            return 1;
        }
        if (o1.age < o2.age) {
            return -1;
        }
        return 0;
    }
}
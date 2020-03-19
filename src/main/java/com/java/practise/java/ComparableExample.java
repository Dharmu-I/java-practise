package com.java.practise.java;

import java.util.*;

public class ComparableExample {

    private static void display(List<Person> personList) {
        for (Person person : personList) {
            System.out.println("Name : " + person.name + "\t Age : " + person.age);
        }
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            personList.add(new Person(new Random().nextInt(99), "Person" + i));
        }
        System.out.println("===Before sort====");
        display(personList);
        System.out.println("===After sort====");
        Collections.sort(personList);
        display(personList);
    }
}

class Person implements Comparable<Person> {

    int age;

    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        if (this.age > o.age) {
            return 1;
        }
        if (this.age < o.age) {
            return -11;
        }
        return 0;
    }
}

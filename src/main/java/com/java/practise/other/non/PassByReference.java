package com.java.practise.other.non;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dharmu.i on 2019-07-26
 */
public class PassByReference {

    public static void main(String[] args) {
        List<String> values = new ArrayList<>();
        values.add("Dharmu");
        addValues(values);
        System.out.println(values.toString());
    }

    private static void addValues(List<String> values) {
        values.add("Immannavar");
    }
}

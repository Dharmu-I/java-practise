package com.java.practise.parkinglot.utils;

public class ObjectUtils {

    private ObjectUtils() {
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty() || str.trim().equalsIgnoreCase("null");
    }

    public static boolean isNullObject(Object object) {
        return object == null;
    }
}

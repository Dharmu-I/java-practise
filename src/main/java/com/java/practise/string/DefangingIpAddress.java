package com.java.practise.string;

public class DefangingIpAddress {

    public String defangIPaddr(String address) {
        StringBuilder newStringBuilder = new StringBuilder();
        for (int i = 0; i < address.length(); i++){
            if (address.charAt(i)=='.'){
                newStringBuilder.append("[").append(address.charAt(i)).append("]");
                continue;
            }
            newStringBuilder.append(address.charAt(i));
        }
        return newStringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new DefangingIpAddress().defangIPaddr("1.1.1.1"));
        System.out.println(new DefangingIpAddress().defangIPaddr("255.100.50.0"));
        System.out.println(new DefangingIpAddress().defangIPaddr("255"));
        System.out.println(new DefangingIpAddress().defangIPaddr(""));
    }
}

package com.java.url.shortner.demo;

import java.util.Random;

public class UrlConverterLogic {

    static char[] invalues = {'a', 'b','c','d','e','d','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u',
        'v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};

    private static String getShortenUrl(String url){
        StringBuilder finalStringBuilder = new StringBuilder();
        String hashValue = getUrlHashCode(url)+""+getSalt();
        int tinyValue = Math.abs(getUrlHashCode(hashValue));
        while (tinyValue >= 36){
            finalStringBuilder.append(invalues[tinyValue%36]);
            tinyValue = tinyValue/36;
        }
        finalStringBuilder.append(invalues[tinyValue]);
        return finalStringBuilder.toString();
    }

    private static int getUrlHashCode(String url){
        return Math.abs(url.hashCode());
    }

    private static int getSalt(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(System.currentTimeMillis());
        stringBuilder.append(new Random().nextLong());
        return Math.abs(stringBuilder.hashCode());
    }

    public static void main(String[] args) {
        String url = "my101stservice.my34theservicegroup.my11thstartup.com";
        System.out.println(getShortenUrl(url));
    }
}

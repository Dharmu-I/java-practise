package com.java.practise.leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * dharmu.i on 22/03/19
 */

public class EmailProgram {


    public int numUniqueEmails(String[] emails) {
        Map<String,Integer> newHash = new HashMap<>();
        for(String email: emails){
            String[] emailSub = email.split("@");
            String domain = emailSub[1];
            String[] forwardSub = emailSub[0].split("\\+");
            String forwardSubString = forwardSub[0].replace(".","");
            newHash.put(forwardSubString+"@"+domain,1);
        }
        return newHash.size();
    }

    public static void main(String[] args) {

        EmailProgram emailProgram = new EmailProgram();
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println("Number of unique emails : " +emailProgram.numUniqueEmails(emails));
    }
}

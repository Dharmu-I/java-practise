package com.java.practise.other.non;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;

/**
 * @author dharmu.i on 2019-09-26
 */
public class CipherTime {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException {
        long startTime = System.currentTimeMillis();
        for (int i = 0;i<10000;i++) {
            Cipher encCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        }
        System.out.println("Time taken "+(System.currentTimeMillis()-startTime));
    }
}

package com.java.practise.optimisation;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestClass {

    @Test
    public void testClassMethod() {
        Map<Person,Integer> map = new HashMap<>();
        for (int i=0; i< 100; i++){
            map.put(new Person("Jon"),1);
        }
        Assert.assertEquals(map.size(),1);
    }
}

package com.core;

import org.junit.Assert;
import org.junit.Test;

public class MainJavaTest {
    private  MainJava mainJava = new MainJava();
    @Test
    public  void mainTest(){
        Assert.assertEquals("chandu", mainJava.Hello("chandu"));
    }
}

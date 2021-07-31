package com.desinpatterns;

public class SingletonEnumTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        System.out.println(singleton);
    }
}

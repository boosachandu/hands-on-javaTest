package com.core;

public class Sub{
    private SingletonClass singletonClass1; //= SingletonClass.getInstance();
    private SingletonClass singletonClass2;// = (SingletonClass)singletonClass1.clone();
    public Sub() throws CloneNotSupportedException {
        singletonClass1 = SingletonClass.getInstance();
        singletonClass2 = (SingletonClass)singletonClass1.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
       // SingletonClass singletonClass1 = SingletonClass.getInstance();
       // SingletonClass singletonClass2 = (SingletonClass)singletonClass1.clone();
        Sub sub = new Sub();
        System.out.println(sub.singletonClass1.hashCode());
        System.out.println(sub.singletonClass2.hashCode());
    }
}

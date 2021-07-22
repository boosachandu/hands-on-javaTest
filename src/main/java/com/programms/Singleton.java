package com.programms;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton instance() {
        if (singleton != null) {
            return singleton;
        }
        synchronized (Singleton.class) {
            if (singleton != null) {
                return singleton;
            }
            singleton = new Singleton();
        }
        return singleton;
    }
}

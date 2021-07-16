package com.interview;

public class TryCatchReturn {

    public static void main(String[] args) {
        TryCatchReturn tryCatchReturn = new TryCatchReturn();
        int i = tryCatchReturn.check();
        System.out.println(i);
    }

    public int check() {
        try {
            System.out.println("in try block");
            return 1;
        } catch (Exception e) {
            System.out.println("In Catch block");
            return 2;
        } finally {
            System.out.println("In finally block");
            return 3;
        }
    }
}

package com.core;

public class FibonacciWithSpace {
    //Optimized method
    private static int fib(int n) {
        int a = 0;
        int b = 1;
        int c;

        if (n == 0 || n == 1) {
            System.out.println(a);
            return a;
        }else {
            System.out.print(a + " ");
            System.out.print(b + " ");
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(fib(n));
    }
}

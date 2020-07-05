package com.core;

public class FibonacciWithDynamic {

    private static int fib(int n) {
        //Array to store Fibonacci series
        int[] f = new int[n + 1];
        int i;
        //0th and 1st number series are 0 and 1
        f[0] = 0;

        if (n > 0) {
            f[1] = 1;
            for (i = 2; i <= n; i++)
                //add the previous two numbers in the series and store
                f[i] = f[i - 1] + f[i - 2];
        }
        for (int k : f) {
            System.out.print(k + " ");
        }
        return f[n];
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(fib(n));
    }
}

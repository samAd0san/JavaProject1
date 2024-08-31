package com.Fibonacci;

public class FibIterative {
    // Fib
    // Fibonacci series -> 0 1 1 2 3 5 8 13 21 34 .......
    public void fib_iterative(int num) {
        int first = 0;
        int second = 1;
        int next = 0;

        for (int i = 2; i <= num; i++) {
            // The index will be starting from zero (In fibonacci series)
            next = first + second;
            first = second;
            second = next;
        }

        System.out.println(next);
    }
}


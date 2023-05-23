package com.Fibonacci;

public class Main extends FibRecursion {
    // Fibonacci series -> 0 1 1 2 3 5 8 13 21 34 .......
    // The index will be starting from zero (In fibonacci series)

    public static void main(String[] args) {
       FibIterative obj1 = new FibIterative();
        System.out.println("By using Iterative approach");
       obj1.fib_iterative(5);
        System.out.println();

        System.out.println("By using Recursive approach");
       System.out.println(fib_recursion(5));
        System.out.println();

        System.out.println("By using Memoization approach");
        System.out.print(fib_memoization(5));
    }
}

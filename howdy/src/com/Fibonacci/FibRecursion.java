package com.Fibonacci;

import java.util.HashMap;
import java.util.Map;

public class FibRecursion {
    // This function uses Fibonacci series by Recusive approach
    public static int fib_recursion(int num) {
        if (num == 0)
            return 0;
        if (num == 1 || num == 2)
            return 1;

        return fib_recursion(num-1) + fib_recursion(num-2);
    }

    // This function uses Fibonacci series by memoization approach
    // Memoization is a technique which is used to save the result of expensive functions by reusing the code when the same input occurs
    // e.g if fib(5) is already calculated it is not necessary to calculate it again we use the saved value (which saves the memory)
    private static Map<Integer,Integer> cache = new HashMap<>();
    public static int fib_memoization(int num) {
        if (cache.containsKey(num)) { // When the value if calculated it is stored in hashmap so if it comes in use again we can take it from here
            return cache.get(num);
        }
        if (num == 0)
            return 0;

        if (num == 1 || num == 2)
            return 1;

        int result = fib_memoization(num-2) + fib_memoization(num-1);
        cache.put(num,result); // now we are using the same input number if it repeats
        return result;
    }

}

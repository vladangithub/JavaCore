package com.vladan.javasundry;

public class Recursion {
    public static void main(String[] args) {

        // 4! = 4 * 3 * 2 * 1

        System.out.println(factorial(4));
    }

    private static int factorial(int n) {
        if (n == 1)
            return 1;

        return n * factorial(n - 1);
    }

}

package com.blz.program;

public class Fibonacci {
    public static void fibonacci(int N) {
        int num1 = 0;
        int num2 = 1;
        int count = 0;
        while (count < N) {
            System.out.println(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            count = count + 1;
        }
    }

    public static void main(String[] args) {
        int N = 10;
        fibonacci(N);

    }
}

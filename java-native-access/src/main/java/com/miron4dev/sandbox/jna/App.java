package com.miron4dev.sandbox.jna;

public class App {

    static {
        System.loadLibrary("fibonacci");
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Argument is missing");
        }
        int n = Integer.parseInt(args[0]);

        System.out.println("Calculating Fibonacci number for n=" + n);
        Fibonacci fibonacci = Fibonacci.INSTANCE;
        System.out.println(fibonacci.fib(n));
    }
}

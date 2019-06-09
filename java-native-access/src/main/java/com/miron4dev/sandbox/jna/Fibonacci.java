package com.miron4dev.sandbox.jna;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface Fibonacci extends Library {

    Fibonacci INSTANCE = Native.load("fibonacci", Fibonacci.class);

    int fib(int n);
}

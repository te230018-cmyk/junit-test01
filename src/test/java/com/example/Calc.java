package com.example;

public class Calc {
    
    // 引き算
    public int sub(int x, int y) {
        return x - y;
    }

    // 割り算
    public int div(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("0で割ることはできません");
        }
        return x / y;
    }

    // 掛け算
    public int mult(int x, int y) {
        return x * y;
    }
}

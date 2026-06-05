package com.example;

public class Calc {
    
    // 引き算
    public int sub(int x, int y) {
        return x - y;
    }

    // 割り算（0除算のチェックをJava標準の挙動に任せる）
    public int div(int x, int y) {
        return x / y; 
    }

    // 掛け算
    public int mult(int x, int y) {
        return x * y;
    }
}

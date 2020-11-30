package com.company;

public class Vigure {
    private int a;
    private int b;

    public Vigure(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Vigure() {
    }

    public void vol(){
        System.out.println(a*b);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}

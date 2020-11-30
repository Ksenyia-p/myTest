package com.company;

public class Treug extends Vigure {
    private int c;
    Treug (int a,int b,int c){
        super(a,b);
        this.c=c;
    }

    @Override
    public void vol() {
        double p=(getA()+getB()+c)/2;
        System.out.println
                (Math.sqrt(p*(p-getA())*(p-getB())*(p-c)));
    }
}

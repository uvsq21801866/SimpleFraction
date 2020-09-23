package com.company;

public class Fraction {
    public int num;
    public int denum;

    public Fraction(){}

    public Fraction(int i, int j) {
        this.num = i;
        this.denum = j;
    }

    public String toString (){
        return (Integer.toString(this.num)/Integer.toString(this.denum));
    }
}

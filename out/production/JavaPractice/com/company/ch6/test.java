package com.company.ch6;

public class test {
    int num;
    boolean isKwang;

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public SutdaCard() {
    }

    public String info() {
        return 1 <= this.num && this.num <= 10 ? Integer.toString(this.num) : "1K";
    }

}
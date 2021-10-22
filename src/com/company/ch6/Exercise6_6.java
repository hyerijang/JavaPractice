package com.company.ch6;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Exercise6_6 {


    public static void main(String args[]) {
        MyPoint point = new MyPoint(1,1);
        System.out.println(point.getDistance(2,2));
    }

}

class MyPoint {
    int x;
    int y;
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //인스턴스 메서드
    double getDistance(int x1, int y1) {

        return sqrt(pow((x1 - x), 2) + pow((y1 - y), 2));
    }

//    static double getDistance(int x, int y, int x1, int y1) {
//
//        return sqrt(pow((x1 - x), 2) + pow((y1 - y), 2));
//    }
}

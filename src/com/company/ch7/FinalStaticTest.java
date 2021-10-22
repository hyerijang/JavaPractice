package com.company.ch7;

public class FinalStaticTest {

    final int NUMBER;
    final static int FSNUMBER = 7;

    public FinalStaticTest() {
        NUMBER = 98765321;
//        final static 은 생성자로 초기화 불가
//        FSNUMBER = 111; //컴파일에러
    }

    public static void main(String[] args) {
        System.out.println("FSNUMBER = " + FSNUMBER);
    }


}

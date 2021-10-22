package com.company.ch6;

public class OverloadingTest {

    void printHello() {
        System.out.println("hello");
    }

    //리턴 타입만 다른 경우는 오버로딩 x : 컴파일 오류 발생
//        String printHello(){
//            System.out.println("hello");
//            return "hello";
//        }java.lang.Object


    //오버로딩(o)
    String printHello(String s) {
        System.out.println(s);
        return s;
    }


}

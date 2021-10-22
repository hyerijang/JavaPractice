package com.company.ch7;

public class DownCasting {


    private static class Child extends Parent {
        int c = 1;
    }

    private static class Parent {
        int p = 0;
    }

    public static void main(String[] args) {
        Parent p = new Child();
        Child c = (Child) p;
        System.out.println("원래 가리키던 인스턴스가 chile타입 이므로 문제x ");


        //TODO : 가리키는 인스턴스가 부모타입인 경우
        p = new Parent();
        //NOTE : instanceof로 검사한 경우 자식 타입으로 형변환 가능
        Child child = null;
        if (p instanceof Child) {
            child = (Child) p;
        }
        System.out.println("다운캐스팅 ok");

        //instanceof로 검사한 건에 대해서만 다운캐스팅 가능
        child = (Child) p;
        //NOTE : instanceof로 검사하지 않으면 런타임 오류 발생
        // Exception :  cannot be cast ~~~
        System.out.println("런타임 오류 발생하여 이 문장은 출력되지 못함");
    }
}

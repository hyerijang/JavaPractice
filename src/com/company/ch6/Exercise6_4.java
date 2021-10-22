package com.company.ch6;

public class Exercise6_4 {

    public static void main(String[] args) {
        System.out.println("연습문제 6-4");
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        System.out.println(" 이름:"+s.name);
        System.out.println(" 총점:"+s.getTotal());
        System.out.println(" 평균:"+s.getAverage());

        System.out.println("연습문제 6-5");

        Student s2 = new Student("김영희",1,1,100,60,76);
        System.out.println(s2.info());

    }
}

class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student() {
    }

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal(){
        return kor+eng+math;
    }

    float getAverage(){
        return (int)(getTotal() / 3f *10 +0.5f) /10f;
    }

    public String info() {
        return this.name
                +","+ this.ban
                +","+ this.no
                +","+ this.eng
                +","+ this.kor
                +","+ this.math
                +","+ getTotal()
                +","+ getAverage()
                ;
    }
}

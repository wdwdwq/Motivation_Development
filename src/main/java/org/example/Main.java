package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // Main 클래스 진입 (메인 메소드)

        Scanner sc= new Scanner(System.in);//콘솔 입력 읽기 위해 Scanner 객체 생성

        new App(sc).run(); //App 클래스에 Scanner 객체를 생성자 인자로 전달하고, run 을 호출

        sc.close(); // Scanner 객체 닫기
    }


}
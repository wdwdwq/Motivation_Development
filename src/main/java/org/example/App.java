package org.example;

import java.util.Scanner;

public class App { // App 클래스 정의
    //
    private Scanner sc;
    //생성자
    public App(Scanner sc){
        this.sc = sc ;
    }
    public void run(){
        System.out.println("== motivation start ==");

        int lastId = 1; // id 값 부여 추가 명령어 실행 시 id 증가
        while (true) {
            System.out.print("command) ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("exit")) {
                System.out.println("== motivation end ==");
                break;
            } else if (cmd.length() == 0) {
                System.out.println("명령어 입력해");
                continue;
            }

            if (cmd.equals("add")) {
                System.out.print("motivation : ");
                String motivation = sc.nextLine();
                System.out.print("source : ");
                String source = sc.nextLine();
                System.out.printf("%d번 motivation이 등록 되었습니다\n", lastId); // 아이디 출력하고
                lastId++;//아이디 증가
            } else if (cmd.equals("list")) {
                System.out.println("== motivation list ==");
                System.out.printf("  id   //   motivation   //  source   \n");
                System.out.println("=".repeat(35));// 메서드 주어진 문자열 지정된 횟수만큼 반복 
            }
        }
    }
}

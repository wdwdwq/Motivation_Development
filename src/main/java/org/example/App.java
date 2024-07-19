package org.example;

import java.util.Scanner;

public class App { // App 클래스 정의
    //
    private Scanner sc; // 인스턴스 변수 private로 선언 App 클래수 외부에서 접근 할 수 없음
    //생성자
    public App(Scanner sc){ // Scanner 객체를 인자로 받음
        this.sc = sc ; // 인스턴스 변수에 저장
    }
    //생성자를 publi로 선언하면 해당 클래스의 객체를 다른 클래스에서 접근 할 수 있음
    //private나 protected로 선언하면 객체를 선언 할 수 있는 범위 제한 된다
    //메서드
    public void run(){ // 메서드
        System.out.println("== motivation start =="); // ln은 출력되는 순간 한줄 Enter 효과가 있음
        while(true){ // 무한 루프 별도의 종료가 있어야 종료 된다
            System.out.println("명령어 ) ");
            String cmd  = sc.nextLine(); //  사용자 입력을 cmd 변수에 저장

            if(cmd.equals("exit")){
                System.out.println("===종료===");
                break; //exit 입력 받으면 여기서 코드 끝
            }else if (cmd.length() == 0){ // // 사용자 빈 명령어 입력하면
                System.out.println("명령어 입력해"); // 이 문장 출력하고
                continue; // 명령어를 입력받는 곳으로 돌아간다
            }

            if(cmd.equals("add")){
                System.out.println("motivation : ");
                String motivation = sc.nextLine(); // 한 줄 전체를 읽어 변수에 저장
                System.out.println("source : ");
                String source = sc.nextLine();
                System.out.println("~번 motivation이 등록 되었습니다");
            }
        }
    }
}

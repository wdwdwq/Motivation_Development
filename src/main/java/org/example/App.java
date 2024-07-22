package org.example;

import org.example.controller.MotivationController;
import org.example.controller.SystemController;
import org.example.entity.Motivation;

import java.util.Scanner;


public class App {

    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== motivation start ==");


        SystemController systemController = new SystemController();
        MotivationController motivationController = new MotivationController(sc);

        while (true) {
            System.out.print("command) ");
            String cmd = sc.nextLine().trim();
            systemController.exit();
            if (cmd.equals("exit")) {

                break;
            } else if (cmd.length() == 0) {
                System.out.println("명령어 입력해");
                continue;
            }

            if (cmd.equals("add")) {
                motivationController.add();
            } else if (cmd.equals("list")) {
                motivationController.list();


            }
        }
    }
}

package org.example;

import org.example.controller.MotivationController;
import org.example.controller.SystemController;



public class App {
    public void run() {
        System.out.println("== motivation execution ==");

        SystemController systemController = new SystemController();
        MotivationController motivationController = new MotivationController();

        while (true) {
            System.out.print("command) ");
            String cmd = Container.getScanner().nextLine().trim();

            if (cmd.equals("exit")) {
                systemController.exit();
                break;
            } else if (cmd.length() == 0) {
                System.out.println("명령어 입력해");
                continue;
            }

            if (cmd.equals("add")) {
                motivationController.add();
            } else if (cmd.equals("list")) {
                motivationController.list();
            } else if (cmd.equals("delete")) {
                motivationController.delete();

                Rq rq = new Rq(cmd);

                System.out.println(rq.getActionMethod());
                System.out.println(rq.getParams("id"));
                System.out.println(rq.getParams("source"));
                System.out.println(rq.getParams("motivation"));
            } else {
                System.out.println("사용할 수 없는 명령어입니다");
            }
        }
    }
}

package org.example.controller;

import org.example.entity.Motivation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotivationController {

    int lastId;
    List<Motivation> motivations;
    Scanner sc;

    public MotivationController(Scanner sc) {
        this.sc = sc;
        lastId = 0;
        motivations = new ArrayList<>();
    }

    public void add() {
        int id = lastId + 1;
        System.out.print("motivation : ");
        String body = sc.nextLine();
        System.out.print("source : ");
        String source = sc.nextLine();

        Motivation motivation = new Motivation(id, body, source);
        motivations.add(motivation);

        System.out.printf("%d번 motivation이 등록 되었습니다\n", id);
        lastId++;
    }

    public void list() {
        if (motivations.isEmpty()) {
            System.out.printf("등록된거 없어");
            return;
        }
        System.out.println("== motivation list ==");
        System.out.println("  id   //   motivation   //  source   \n");
        System.out.println("=".repeat(35));

        for (int i = motivations.size() - 1; i >= 0; i--) {
            Motivation motivation = motivations.get(i);

            if (motivation.getSource().length() > 7) {
                System.out.printf("   %d  //    %s    //    %s  \n", motivation.getId(), motivation.getSource().substring(0, 5) + "...", motivation.getBody());
                continue;
            }
            System.out.printf("  %d   //   %s   //  %s   \n", motivation.getId(), motivation.getSource(), motivation.getBody());
        }
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static Story story;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int s = 40;
        int a = 30;
        int z = 60;
        System.out.println("=====\nСытость:" + s + "\tУровень пива в крови:"
                + a + "\tЗдоровье:" + z + "\n=====");
        while (true) {
            story = new Story(n);
            if (n == 0) {
                System.out.println("===Игра 'После шумной тусовки'=== \n "
                        + "Коротенькие правила. Как только твоё здоровье достигает нуля, ты умираешь. Меньше сытости - меньше здоровья. Больше пива - меньше здоровья. Остальное поймёшь в процессе, погнали спасать работягу\n");
            }
            if (n != 0) {
                System.out.println("=====\nСытость:" + s + "\tУровень пива в крови:"
                        + a + "\tЗдоровье:" + z + "\n=====");
                if (z <= 0) {
                    System.out.println("====================Вы умерли, начните заново===================");
                    return;
                } else {
                    if (n == 3) {
                        System.out.println("====================Жизнь продолжается!===================");
                        System.out.println("====================Респекты, братка!===================");
                        return;
                    }
                    if (n != 3) {
                        System.out.println("=============" + story.current_situation.subject + "==============");
                        System.out.println(story.current_situation.text);
                        if (story.isEnd()) {
                            System.out
                                    .println("====================Конец!===================");
                            return;
                        }
                        story.go(in.nextInt());
                        s+=story.current_situation.s;
                        a+=story.current_situation.a;
                        z+=story.current_situation.z;
                        n++;
                    }
                }
            } else {
                System.out.println("=============" + story.current_situation.subject + "==============");
                System.out.println(story.current_situation.text);
                if (story.isEnd() || n == 3) {
                    System.out.println("====================Конец!===================");
                    return;
                }
                story.go(in.nextInt());
                s+=story.current_situation.s;
                a+=story.current_situation.a;
                z+=story.current_situation.z;
                n++;
            }
        }
    }
}
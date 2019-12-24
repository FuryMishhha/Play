/*package com.company;
import com.company.Story;

public class Fut{

    private Situation start_story1;
    public Situation current_situation1;
    public   Story[]fut;
    Fut() {

        start_story1 = new Situation(
                "Матчи сборной россии",
                "Команды\n "
                        + "(1)Италия\n"
                        + "(2)Бразилия\n"
                        + "(3)Франция\n",

                3,
                0,
                0
        );
        start_story1.direction[0] = new Situation("первый матч",
                "Италия",
                0,
                13,
                23
        );
        start_story1.direction[1] = new Situation("второй матч",
                "Бразилия",
                0,
                25,
                25
        );
        start_story1.direction[2] = new Situation("Финал",
                "Франция",
                0,
                40,
                40
        )








        current_situation1 = start_story1;
    }

    public void go1(int num) {
        if (num <= current_situation1.direction.length)
            current_situation1 = current_situation1.direction[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + current_situation1.direction.length + " вариантов");
    }
    public boolean isEnd() {
        return current_situation1.direction.length == 0;
    }
}*/
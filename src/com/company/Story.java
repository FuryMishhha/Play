package com.company;

public class Story {

    private Situation start_story;
    public Situation current_situation;

    Story(int n) {
        if (n == 0) {
            start_story = new Situation(
                    "Уборка (ну или нет...)",
                    "Вчера было весело, было много алкоголя, еды, но вот настало время принимать примеры по ликвидации ЧП в вашей квартире"
                            + "Вы открываете глаза. Поднимате голову. Вы видите этот ад вокруг вас. Стоит выбор над тем, какие предпринимать действия\n"
                            + "(1)Полежу ещё. Может всё само собой случится\n"
                            + "(2)Встать с кровати и выпить кормушечку холодного Жигуля прямо из холодильника\n"
                            + "(3)Пойти покушать остатки вчерашней пиццы и малость прибраться",
                    3, 0, 0, 0);
            start_story.direction[0] = new Situation(
                    "",
                    "",
                    0, -20, -10, 10);
            start_story.direction[1] = new Situation(
                    "",
                    "",
                    0, -5, 30, -30);
            start_story.direction[2] = new Situation(
                    "",
                    "",
                    0, 30, -10, 10);
        }
        if (n == 1) {
            start_story = new Situation(
                    "Лады, но теперь то что делать будем?",
                    "(1)Винище - красотииище! Выпьем и без повода!\n"+
                            "(2)Жигулём меньше, Жигулём больше!\n"+
                            "(3)Подниму ребят и накормплю их",
                    3, 0, 0, 0);
            start_story.direction[0] = new Situation(
                    "",
                    "",
                    0, -10, 30, -30);
            start_story.direction[1] = new Situation(
                    "",
                    "",
                    0, -5, 30, -30);
            start_story.direction[2] = new Situation(
                    "",
                    "", 0, 10,
                    -10, 5);
        }
        if (n == 2) {
            start_story = new Situation(
                    "Уборка или во все тяжкие?",
                    "(1)Во все тяжкие\n"+
                          "(2)Убираемся и расходимся\n"+
                          "(3)Бог с ним, просто вздремну",
                    3, 0, 0, 0);
            start_story.direction[0] = new Situation(
                    "",
                    "",
                    0, -5, 20, -20);
            start_story.direction[1] = new Situation(
                    "",
                    "",
                    0, 5, -10, 5);
            start_story.direction[2] = new Situation(
                    "",
                    "", 0, -5,
                    -10, 10);
        }

        current_situation = start_story;
    }

    public void go(int num) {
        if (num <= current_situation.direction.length)
            current_situation = current_situation.direction[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + current_situation.direction.length + " вариантов");
    }

    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }
}
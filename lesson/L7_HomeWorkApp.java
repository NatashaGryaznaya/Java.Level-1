package ru.geekbrains.lesson7.lesson;

import java.util.Scanner;

public class L7_HomeWorkApp {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Бусинка", 5, false);
        allCats[1] = new Cat("Снежок", 10, false);
        allCats[2] = new Cat("Мурзик", 10, false);
        allCats[3] = new Cat("Пузик", 45, false);


        PlateFood plate = new PlateFood(50);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].fullness == false && allCats[i].appetite < plate.food){
                allCats[i].eat(plate);
                allCats[i].fullness = true;
                System.out.println("Котик " + allCats[i].name + " покушал!");
            } else {
                System.out.println("Котик " + allCats[i].name + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько грамм корма добавить еще в миску?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}


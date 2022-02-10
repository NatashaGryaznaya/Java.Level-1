package ru.geekbrains.lesson6.lesson;

public class Lesson6 {
    public static void main(String[] args) {

        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Кот Сиамский", "Мурзик", 0, 0);
        animals[1] = new Cat("Кошка Русская Голубая", "Алиса", 0, 200);
        animals[2] = new Dog("Собака Пудель", "Наг", 2, 200);
        animals[3] = new Dog("Собака Доберман", "Лора", 10, 500);

        System.out.println("Характеристики созданных животных");
        System.out.println("---------------------------------------------------------------------------------------");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Всего котов создано: " + (Cat.getCount()));
        System.out.println("Всего собак создано: " + (Dog.getCount()));
        System.out.println("Всего животных создано: " + Animal.getCount());
        System.out.println();
        System.out.println("Тестирование на выносливость: ");
        System.out.println("Бег: ");
        System.out.println("---------------------------------------------------------------------------------------");

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(500, 200);
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Плавание: ");
        System.out.println("---------------------------------------------------------------------------------------");

        for (int i = 0; i < animals.length; i++) {
            animals[i].swim(10);
        }
    }
}

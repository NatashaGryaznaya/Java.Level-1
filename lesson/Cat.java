package ru.geekbrains.lesson6.lesson;

public class Cat extends Animal {
    private static int count;

    public Cat(String type, String name, int swims, int distanceCat) {
        this.type = type;
        this.name = name;
        this.swims = swims;
        this.run = distanceCat;
        count++;
    }


    public static int getCount() {
        return count;
    }
}
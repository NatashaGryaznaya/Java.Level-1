package ru.geekbrains.lesson6.lesson;

public class Dog extends Animal {
    private static int count;

    public Dog(String type, String name, int swims, int distanceDog) {
        this.type = type;
        this.name = name;
        this.swims = swims;
        this.run = distanceDog;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
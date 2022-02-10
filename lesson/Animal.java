package ru.geekbrains.lesson6.lesson;

public class Animal {
    protected String type;
    protected String name;
    protected int swims;
    protected int run;
    private static int count;


    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }


    @Override
    public String toString() {
        return "Вид/порода: '" + type + '\'' +
                ", Кличка: '" + name + "\' \nРезультаты действий:" +
                ", Может проплыть " + swims + "м. " +
                ", Может пробежать " + run + "м. \n";
    }

    protected void run(int distanceDog, int distanceCat) {
        if (run >= distanceDog) {
            System.out.println(this.type + " по кличке " + this.name + "  - УСПЕШНО пробежал(а) " + distanceDog + "м.");
        } else if (run >= distanceCat) {
            System.out.println(this.type + " по кличке " + this.name + "  - УСПЕШНО пробежал(а) " + distanceCat + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- сошел(а) с дистанции ---- ");
        }
    }

    protected void swim(int distance) {
        if (swims >= distance) {
            System.out.println(this.type + " по кличке " + this.name + "   - УСПЕШНО проплыл(а) " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- не выполнил норматив ---- ");
        }
    }
}
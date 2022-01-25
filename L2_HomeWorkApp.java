package ru.geekbrains.lesson2;

public class L2_HomeWorkApp {
    public L2_HomeWorkApp() {
    }

    public static void main(String[] args) {
        System.out.println(within10and20(2,3));
        isPositiveOrNegative(11);
        System.out.println(isNegative(-16));
        printWordNTimes();
        System.out.println(year(1900));
    }

    public static boolean within10and20(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        if (sum >= 10 && sum >= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int printNumber) {
        if (printNumber >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean isNegative(int negative) {
        if (negative < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printWordNTimes() {
        for (int x = 1; x < 6; x++) {
            System.out.println(x + " Don't worry, be happy");
        }
    }

    public static boolean year(int y) {
        if (y % 4 == 0 && y % 100 == 0 && y % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
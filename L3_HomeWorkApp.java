package ru.geekbrains.lesson3;

public class L3_HomeWorkApp {
    public L3_HomeWorkApp() {
    }

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal(6);
        fillWithInitialValue(5, 6);
        System.out.println(minInArray());
        System.out.println(maxInArray());
    }

    public static void invertArray() {
        int[] arrFirst = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arrFirst.length; i++) {
            if (arrFirst[i] <= 0) {
                arrFirst[i] += 1;
            } else {
                arrFirst[i] -= 1;
            }
            System.out.println(arrFirst[i] + " ");
        }
    }

    public static void fillArray() {
        int[] arrSecond = new int[100];
        for (int i = 0; i < arrSecond.length; i++) {
            arrSecond[i] = i;
            System.out.println("arr[" + i + "] = " + arrSecond[i]);
        }
    }

    public static void changeArray() {
        int[] arrThree = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arrThree.length; i++) {
            if (arrThree[i] < 6){
                arrThree[i] *= 2;
            }
            System.out.println(arrThree[i] + " ");
        }
    }

    public static void fillDiagonal(final int size) {
        int[][] arrFour = new int[size][size];
        for (int i = 0; i < arrFour.length; i++) {
            arrFour[i][i] = 1;
            arrFour[arrFour.length - 1 - i][i] = 1;
        }
    } //Если честно, не представляю как это правильно написать и вывести

    public static int[] fillWithInitialValue(final int len, final int initialValue) {
        int arrFive[] = new int[len];
        for (int i = 0; i < arrFive.length; i++){
            arrFive[i] = initialValue;
            System.out.println(arrFive[i] + " ");
        }
        return arrFive;
    }

    public static int minInArray() {
        int[] arrSixMin = {1, 3, 54, 2, 4, -15, 66, 1, 65, 23, -60};
        int min = arrSixMin[0];
        for (int i = 0; i < arrSixMin.length; i++) {
            if (arrSixMin[i] < min) {
                min = arrSixMin[i];
            }
        } return min;
    }

    public static int maxInArray() {
        int[] arrSixMax = {1, 3, 54, 2, 4, -15, 66, 1, 65, 23, -60};
        int max = arrSixMax[0];
        for (int i = 0; i < arrSixMax.length; i++) {
            if (arrSixMax[i] > max) {
                max = arrSixMax[i];
            }
        } return max;
    }



}

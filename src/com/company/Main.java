package com.company;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int[] array = {96, 55, 21, 15, 25, 40, 98};
        System.out.print("Введенный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Отсортированный массив: ");
        array = sortThanos(array);
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }

    public static int[] sortThanos(int[] mass) {
        int[] helpArray = new int[0];
        if (mass.length < 2) {
            return mass;
        }
        double summ = 0;
        for (int j : mass) {
            summ += j;
        }
        double count = mass.length;
        double avg = summ / count;
        int min = 0;
        int max = mass.length - 1;
        helpArray = new int[mass.length];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] <= avg) {
                helpArray[min] = mass[i];
                min++;
            } else {
                helpArray[max] = mass[i];
                max--;
            }
        }
        mass = Arrays.copyOf(helpArray, helpArray.length);
        int[] firstArray = Arrays.copyOf(mass, mass.length / 2);
        int[] secondArray = Arrays.copyOfRange(mass, mass.length / 2, mass.length);
        firstArray = sortThanos(firstArray);
        secondArray = sortThanos(secondArray);
        return mergeArray(firstArray, secondArray);
    }

    public static int[] mergeArray(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for (int j = 0; j < b.length; j++) {
            c[count++] = b[j];
        }
        return c;
    }
}

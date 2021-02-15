package com.company;

import java.util.Arrays;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        int[] array = {96, 55, 21, 15, 25, 40};
        out.print("Введенный массив: ");
        for (int j = 0; j < array.length; j++) {
            out.print(array[j] + " ");
        }
        out.println();
        out.print("Отсортированный массив: ");
        sortThanos(array);

    }

    public static void sortThanos(int[] mass) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            double summ = 0;
            for (int j : mass) {
                summ += j;
            }
            double count = mass.length;
            double avg = 0.0;
            avg = summ / count;
            int min = 0;
            int max = mass.length - 1;
            int[] helpArray = new int[mass.length];
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] <= avg) {
                    helpArray[min] = mass[i];
                    min++;
                } else {
                    helpArray[max] = mass[i];
                    max--;
                }
            }
            int size = 0;
            if (helpArray.length % 2 == 0) {
                size = helpArray.length / 2;
            } else {
                size = helpArray.length / 2;
            }
            int[] firstArray = Arrays.copyOf(helpArray, size);
            int[] secondArrays = Arrays.copyOfRange(helpArray, size, helpArray.length);
            if (firstArray.length > 1 || secondArrays.length > 1) {
                sortThanos(firstArray);
                sortThanos(secondArrays);
            }
            if (helpArray.length <= 2) {
                for (int j = 0; j < helpArray.length; j++) {
                    out.print(helpArray[j] + " ");
                }
            }

        }
    }
}
//  double summ = 0;
//         for (int j : mass) {
//             summ += j;
//         }
//         double count = mass.length;
//         double avg = 0.0;
//         avg = summ / count;
//         int[] helpArray = new int[mass.length];
//         for (int i = 0; i < mass.length; i++) {
//             if (mass[i] <= avg) {
//                 helpArray[min] = mass[i];
//                 min++;
//             } else {
//                 helpArray[max] = mass[i];
//                 max--;
//             }
//         }
//         out.println(Arrays.toString(helpArray));
//         int[] firstArray = Arrays.copyOf(helpArray, helpArray.length / 2);
//         int[] secondArrays = Arrays.copyOfRange(helpArray, helpArray.length / 2, helpArray.length);
//         System.out.println(Arrays.toString(firstArray));
//         System.out.println(Arrays.toString(secondArrays));
//         if (firstArray.length <= min) {
//             sortThanos(firstArray, min, max);
//         }
//         if (secondArrays.length <= max) {
//             sortThanos(secondArrays, min, max);
//         }
//
//     }
//
// }

package ru.bondarev.homeworks;

import java.util.Arrays;

public class HW2 {

    public static void main(String[] args) {
        arrayZeroToOne();
        arrayEight();
        arrayMultiplication();
        arrayMinMax();
        arraySquare();
        System.out.println();
        //Задание 6. с использованием retun!!!
        int[] balance = {11, 1, 1, 1, 1, 1, 6};;
        System.out.print("Задание 6.\nIs the " + Arrays.toString(balance) + " balanced? ");
        System.out.println(checkBalance(balance));;
    }

    //    1 ЗАДАНИЕ
/*    Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;**/
    static void arrayZeroToOne() {
        System.out.println("Задание 1.");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            // for (int i = 0; i < arr.length; i++) {
            //2 вариант: arr[i] = (arr[i] == 1) ? 0 : 1;
            //3 вариант: arr[i]  = 1 - arr[i];
            //
        }
        System.out.println(Arrays.toString(arr));

    }

    //    2 ЗАДАНИЕ
/*    Задать пустой целочисленный массив размером 8.
Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22; **/
    static void arrayEight() {
        System.out.println("\nЗадание 2.");
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3 + 1; // правильный вариант!
// Худший вариант if (i == 0) {
//                    arr[i] = 1;
//                }
//                if (i == 1) {
//                    arr[i] = 4;
//                }
//                if (i == 2) {
//                    arr[i] = 7;
//                }
//                if (i == 3) {
//                    arr[i] = 10;
//                }
//                if (i == 4) {
//                    arr[i] = 13;
//                }
//                if (i == 5) {
//                    arr[i] = 16;
//                }
//                if (i == 6) {
//                    arr[i] = 19;
//                }
//                if (i == 7) {
//                    arr[i] = 22;
//                }
        }
        System.out.println(Arrays.toString(arr));


    }

    //    3 ЗАДАНИЕ
/*    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
 метод, принимающий на вход массив и умножающий числа меньше 6 на 2; **/

    static void arrayMultiplication() {
        System.out.println("\nЗадание 3.");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2; // arr[i] *= 2;!!!!
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    //    4 ЗАДАНИЕ
/*    Задать одномерный массив.
Написать методы поиска в нём минимального и максимального элемента **/

    static void arrayMinMax() {
        System.out.println("\nЗадание 4.");
        int[] arr = {10, 5, 3, 2, 11, 4, 5, 2, 4, 8, 19, 1};
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальный элемент в массиве = " + max);
        System.out.println("Минимальный элемент в массиве = " + min);


    }

    //    5 ЗАДАНИЕ
/*    Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
заполнить его диагональные элементы единицами, используя цикл(ы) **/
    static void arraySquare() {
        System.out.println("\nЗадание 5.");
        final int side = 5;
        int[][] arr = new int[side][side];

        // вариант преподавателя.
        int strght, bckwd;
        for (strght = 0,
                     bckwd = arr.length - 1;
             strght < arr.length;
             strght++, bckwd--) {
            arr[strght][bckwd] = 1;
            arr[strght][strght] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();

        // мой вариант
        for (int i = 0; i < arr.length; i++) {
            int a = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i == j || (i == (arr.length - a) && j == (a - 1))) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
                a++;
            }
            System.out.println();
        }
    }

    //    6 ЗАДАНИЕ
/*    Написать метод, в который передается не пустой одномерный целочисленный массив,
метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
Примеры:
checkBalance([1, 1, 1, || 2, 1]) → true,
checkBalance ([2, 1, 1, 2, 1]) → false,
checkBalance ([10, || 1, 2, 3, 4]) → true.
Абстрактная граница показана символами ||, эти символы в массив не входят.
 **/
//                static void arrayCheckBalance () {
//                    System.out.println("\nЗадание 6.");
//
//                    int[] arr = {7, 3, 1, 11};
//
////                    for (int i = 0; i < arr.length; i++) {
////                        if (arr[i] == ((arr[i + 1] + arr[i + 2] + arr[i + 3])) || ((arr[i] + arr[i + 1]) == (arr[i + 2] + arr[i + 3])) || ((arr[i] + arr[i + 1] + arr[i + 2]) == arr[i + 3])) {
////                            System.out.println("true");
////                            break;
////                        } else
////                            System.out.println("false");
////                        break;
////                    }

    private static boolean checkBalance(int[] array) {

        int right = 0, left = 0;
        for (int i = 0; i < array.length - 1; i++){
            left += array[i];
            for (int j = i + 1; j < array.length; j++)
                right += array[j];
            if (left == right) return true;
            right = 0;
        }
        return false;
    }


}

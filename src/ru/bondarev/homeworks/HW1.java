package ru.bondarev.homeworks;

public class HW1 {

        // 1, 2 ЗАДАНИЕ
    /*Создать пустой проект в IntelliJ IDEA и прописать метод main().
    Создать переменные всех пройденных типов данных и инициализировать их значения.*/

        public static void main(String[] args) {
            System.out.println("1 задания: Hello, World! Привет Галактика!");
            // 2 ЗАДАНИЕ
            byte byteValue = -120; //от -128 до 127
            short shortValue = -3500; // от -32768 до 32767
            int integerValue = 2020; // от -2147483648 до 2147483647
            long longValue = 382L; // от -9223372036854775808 до 9223372036854775807

            double doubleValue = 4.5d;
            float floatValue = 1.4f;

            char ch1 = '5';
            String stringValue = "qwerty";

            boolean booleanValue = false; // или true

            System.out.println("2 задание:");
            System.out.println("Значение для типа byte: " + byteValue);
            System.out.println("Значение для типа short: " + shortValue);
            System.out.println("Значение для типа int: " + integerValue);
            System.out.println("Значение для типа long: " + longValue);
            System.out.println("Значение для типа double: " + doubleValue);
            System.out.println("Значение для типа float: " + floatValue);
            System.out.println("Значение для типа char: " + ch1);
            System.out.println("Значение для типа String: " + stringValue);
            System.out.println("Значение для типа boolean: " + booleanValue);

            // 3 ЗАДАНИЕ
    /*Написать метод вычисляющий выражение a * (b + (c / d)) и
    возвращающий результат, где a, b, c, d – входные параметры этого метода.
     */
            int a = 5;
            int b = 10;
            double c = 15.2d;
            float d = 17.8f;
            int value = (int) (a * (b + (c / d)));
            System.out.println("3 задание: value = " + value);

            // 4 ЗАДАНИЕ
    /*Написать метод, принимающий на вход два числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    в противном случае – false */

            int value1 = 10;
            int value2 = 20;
            if ((value1 + value2) > 10 && (value1 + value2) <= 20) {
                System.out.println("4 задание: метод - true");
            } else
                System.out.println("4 задание: метод - false");

            // 5 ЗАДАНИЕ
    /*Создать метод, который принимает число. Если данное число больше 100 и меньше 999 включительно -
    вывести в консоль цифры данного числа в обратном порядке.
    Например, введено число 725 -> в консоле будет: 527. */

            int number = 631;
            if (number > 100 && number <= 999) {
                String newNumber1 = "";
                newNumber1 = newNumber1 + number % 10;
                number = number / 10;
                newNumber1 = newNumber1 + number % 10;
                number = number / 10;
                newNumber1 = newNumber1 + number % 10;
                number = number / 10;
                System.out.println("5 задание: " + newNumber1);
            }

            // 6 ЗАДАНИЕ
    /* ** Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный. */

            int newYear = 100;
            if ((newYear % 4) == 0) {
                if ((newYear % 100) == 0 && (newYear % 400) != 0) {
                    System.out.println("6 задание: год " + newYear + " - не високосный.");
                }else
                    System.out.println("6 задание: год " + newYear + " - високосный.");

            }else
                System.out.println("6 задание: год " + newYear + " - не високосный.");
        }
    }

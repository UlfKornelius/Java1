package ru.bondarev.homeworks.HW4;

public class ManeHW4 {

    public static void main(String[] args) {
        //Задание 4.
        //Вывести при помощи методов из пункта 3 ФИО и должность.
        EmployeeHW4 ShowFullName_Position = new EmployeeHW4();
        System.out.println();

        // Задание 5.
        // Создать массив из 5 сотрудников.
        // С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

        EmployeeHW4[] employeeArray = new EmployeeHW4[5];
        employeeArray[0] = new EmployeeHW4( "Лиманов Александр Сергеевич", "тренер", 322334, 35000, 65);
        employeeArray[1] = new EmployeeHW4( "Коробков Сергей Александрович", "тренер", 322335, 35000, 46);
        employeeArray[2] = new EmployeeHW4( "Вёрсткин Александр Валерьевич", "стажёр", 322336, 20000, 37);
        employeeArray[3] = new EmployeeHW4( "Каменчук Максим Сергеевич", "стажёр", 322337, 25000, 41);
        employeeArray[4] = new EmployeeHW4( "Соснин Вячеслав Эдуардович", "стажёр", 322338, 20000, 45);


        System.out.println("Сотрудники возраста старше 40 лет: ");
        for (EmployeeHW4 task : employeeArray) {
               if (task.getAge() > 40) {
                task.Show();

            }
        }
        System.out.println();
        // Задание 6.
        // * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000;
        System.out.println("Повышение зарплаты для сотрудников возраста старше 45 лет на 5000: ");
        for (EmployeeHW4 task : employeeArray) {
            if (task.getAge() > 45) {
                task.SalaryIncrease();

            }
        }

        // Задание 7.
        // ** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.
        System.out.println();
        System.out.println("Личные номера сотрудников: ");
        for (EmployeeHW4 task : employeeArray) {
                task.Identifier();
                task.Show();

            }
        }







}














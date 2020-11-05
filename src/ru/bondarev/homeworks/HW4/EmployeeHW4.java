package ru.bondarev.homeworks.HW4;

    public class EmployeeHW4 {

        private String fullName;
        private String position;
        private int telefonNumber;
        private int salary;
        private int age;
        static int count = 0;

        EmployeeHW4(String fullName, String position, int telefonNumber, int salary, int age) {

            this.fullName = fullName;
            this.position = position;
            this.telefonNumber = telefonNumber;
            this.salary = salary;
            this.age = age;
        }


        // Задание 3.
        // Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля
        void Show(){
            System.out.println(fullName + "/" + position + "/" + telefonNumber + "/" + salary + "/" + age);
        }

        public String getFullName() {
            return fullName;
        }

        public String getPosition() {
            return position;
        }

        public int getTelefonNumber() {
            return telefonNumber;
        }

        public int getSalary() {
            return salary;
        }

        public int getAge() {
            return age;
        }



        //Задание 4.
        //Вывести при помощи методов из пункта 3 ФИО и должность.
        public EmployeeHW4() {
            ShowFullName_Position();
        }

        void ShowFullName_Position(){
            System.out.println("ФИО: " + fullName + "\nДолжность: " + position);
        }
        // Задание 6.
        // * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000;
        void SalaryIncrease(){

              salary = salary + 5000;
              System.out.println(fullName + "/" + salary);


        }// Задание 7.
        // ** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.

        void Identifier(){
            count++;
            int id = count;
            System.out.println("№" + id);
        }


    }

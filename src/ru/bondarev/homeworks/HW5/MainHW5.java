package ru.bondarev.homeworks.HW5;

public class MainHW5 {

    public static void main(String[] args) {

        DogHW5 dog = new DogHW5("Собачка", 600, 0.5, 15);
        HorseHW5 horse = new HorseHW5("Лошадка", 1600, 5, 90);
        BirdHW5 bird = new BirdHW5("Птичка", 10, 0.3);
        CatHW5 cat = new CatHW5("Кошечка", 200, 2);


/* Задание 4.
При попытке животного выполнить одно из этих действий, оно должно сообщить результат.
(Например, dog1.run(150); -> результат: 'Пёсик пробежал!') **/


    dog.doinRun();
    horse.doinRun();
    bird.doinRun();
    cat.doinRun();

    System.out.println("****************************");

    dog.doinJump();
    horse.doinJump();
    bird.doinJump();
    cat.doinJump();

    System.out.println("****************************");

    dog.doinSwim();
    horse.doinSwim();
    bird.doinSwim();
    cat.doinSwim();

    System.out.println("****************************");

    /* Задание 5.
     * Добавить животным разброс в ограничениях.
     * То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м
     */

        DogHW5 dog1 = new DogHW5("Барбос", 300, 0.5, 7);
        DogHW5 dog2 = new DogHW5("Булка", 700, 1, 20);

        dog1.doinRun();
        dog2.doinRun();




    }



}

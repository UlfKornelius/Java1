package ru.bondarev.homeworks.HW5;

public class CatHW5 extends AnimalHW5 {

    private static  final int catRun_LIMIT = 200;
    private static  final double catJump_LIMIT = 2;

    public CatHW5(String name, int run, double jump){
        super(name, run, jump);

    }


    //Задание 3. Ограничения на действия.
    @Override
    void doinRun() {
        if (run <= catRun_LIMIT) {
            System.out.println(name + " пробежала " + run + " м.");
        } else {
            System.out.println(name + " устанет бежать " + run + " м., её предел - " + catRun_LIMIT + " м.");
        }
    }

    @Override
    void doinJump() {
        if (jump <= catJump_LIMIT) {
            System.out.println(name + " прыгнула на " + jump + " м.");
        } else {
            System.out.println(name + " не сможет прыгнуть на " + jump + " м., её предел - " + catJump_LIMIT + " м.");
        }
    }

    //Ограничения на действие по плаванию.
    @Override
    void doinSwim() {
        System.out.println( name + " плавать не умеет. ");
    }





}

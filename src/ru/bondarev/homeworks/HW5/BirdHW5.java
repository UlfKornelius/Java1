package ru.bondarev.homeworks.HW5;

public class BirdHW5 extends AnimalHW5 {

    private static  final int birdRun_LIMIT = 5;
    private static  final double birdJump_LIMIT = 0.2;


    public BirdHW5(String name, int run, double jump){
        super(name, run, jump);

    }

    //Задание 3. Ограничения на действия.
    @Override
    void doinRun() {
        if (run <= birdRun_LIMIT) {
            System.out.println(name + " пробежала " + run + " м.");
        } else {
            System.out.println(name + " устанет бежать " + run + " м., её предел - " + birdRun_LIMIT + " м.");
        }
    }

    @Override
    void doinJump() {
        if (jump <= birdJump_LIMIT) {
            System.out.println(name + " прыгнула на " + jump + " м.");
        } else {
            System.out.println(name + " не сможет прыгнуть на " + jump + " м., её предел - " + birdJump_LIMIT + " м.");
        }
    }
    //Ограничения на действие по плаванию.
    @Override
    void doinSwim() {
        System.out.println( name + " плавать не умеет. ");
    }







}

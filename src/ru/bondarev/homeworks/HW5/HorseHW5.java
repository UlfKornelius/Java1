package ru.bondarev.homeworks.HW5;

public class HorseHW5 extends AnimalHW5 {

    private static  final int horseRun_LIMIT = 1500;
    private static  final double horseJump_LIMIT = 3;
    private static  final int horseSwim_LIMIT = 100;

    public HorseHW5(String name, int run, double jump, int swim){
        super(name, run, jump, swim);

    }

    //Задание 3. Ограничения на действия.
    @Override
    void doinRun() {
        if (run <= horseRun_LIMIT) {
            System.out.println(name + " пробежала " + run + " м.");
        } else {
            System.out.println(name + " устанет бежать " + run + " м., её предел - " + horseRun_LIMIT + " м.");
        }
    }

    @Override
    void doinJump() {
        if (jump <= horseJump_LIMIT) {
            System.out.println(name + " прыгнула на " + jump + " м.");
        } else {
            System.out.println(name + " не сможет прыгнуть на " + jump + " м., её предел - " + horseJump_LIMIT + " м.");
        }
    }

    @Override
    void doinSwim() {
        if (swim <= horseSwim_LIMIT) {
            System.out.println(name + " проплыла " + swim + " м.");
        } else {
            System.out.println(name + " не сможет проплыть " + swim + " м., её предел - " + horseSwim_LIMIT + " м.");
        }
    }





}

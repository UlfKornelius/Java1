package ru.bondarev.homeworks.HW5;

public class DogHW5 extends AnimalHW5 {

    static  final int dogRun_LIMIT = 500;
    private static  final double dogJump_LIMIT = 0.5;
    private static  final int dogSwim_LIMIT = 10;

    public DogHW5(String name, int run, double jump, int swim){
        super(name, run, jump, swim);

    }


    //Задание 3. Ограничения на действия.
    @Override
    void doinRun() {
        if (run <= dogRun_LIMIT) {
            System.out.println(name + " пробежала " + run + " м.");
        } else {
            System.out.println(name + " устанет бежать " + run + " м., её предел - " + dogRun_LIMIT + " м.");
        }
    }

    @Override
    void doinJump() {
        if (jump <= dogJump_LIMIT) {
            System.out.println(name + " прыгнула на " + jump + " м.");
        } else {
            System.out.println(name + " не сможет прыгнуть на " + jump + " м., её предел - " + dogJump_LIMIT + " м.");
        }
    }

    @Override
    void doinSwim() {
        if (swim <= dogSwim_LIMIT) {
            System.out.println(name + " проплыла " + swim + " м.");
        } else {
            System.out.println(name + " не сможет проплыть " + swim + " м., её предел - " + dogSwim_LIMIT + " м.");
        }
    }
}

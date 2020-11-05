package ru.bondarev.homeworks.HW5;


import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AnimalHW5 {
    protected String name;
    protected int run;
    protected double jump;
    protected int swim;

    public AnimalHW5(String name, int run, double jump, int swim){
        this.name = name;
        this.run = run;
        this.jump = jump;
        this.swim = swim;
    }

    public AnimalHW5(String name, int run, double jump){
        this.name = name;
        this.run = run;
        this.jump = jump;

    }




    void doinRun() {
        System.out.println( name + " пробежала " + run + " метров. ");
    }

    void doinJump() {
        System.out.println( name + " прыгнула на " + jump + " метров. ");
    }

    void doinSwim() {
        System.out.println( name + " проплыла " + swim + " метров. ");
    }









}

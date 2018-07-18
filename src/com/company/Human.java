package com.company;

public abstract class Human {
    Boolean sex;
    String name;
    String surname;
    float height;
    float weight;

    public Human(Boolean sex, String name, String surname, float height, float weight) {
    }

    public void speak() {
        System.out.println("I can speak!");
    }

    public void socialTolerance() {
        System.out.println("I'm social toleranted!");
    }

    public void timeTogether() {
        System.out.println("I can be together ");
    }

    public void haveARelations() {
        System.out.println("I'm in relations!");
    }

    public void giveABirth() {
        System.out.println("I can give a life to a new human!");
    }
}



package com.company;

public class Main {

    public Main(Boolean sex, String name, String surname, float height, float weight) {
    }

    public static void main(String[] args) {
        Man man = new Man(true, "John", "Lennon", 186, 86);
        Woman woman = new Woman(false, "Yoko", "Ono", 166, 56);

        System.out.println(man.toString());
        System.out.println(woman.toString());

        System.out.println("And now as I'am a Man I can tell you that ");
        //System.out.println("And now as I'am a Man I can tell you that " + man.speak() + man.socialTolerance() + man.timeTogether() + man.haveARelations());
        man.speak();
        man.socialTolerance();
        man.timeTogether();
        man.haveARelations();

        System.out.println("And now as I'am a Woman I can tell you that ");
        woman.speak();
        woman.socialTolerance();
        woman.timeTogether();
        woman.haveARelations();
        woman.giveABirth();





    }
}

package com.company;

public class Man extends Human {
    Boolean sex;
    String name;
    String surname;
    float height;
    float weight;

    public Man(Boolean sex, String name, String surname, float height, float weight) {
        super(sex, name, surname, height, weight);
    }


    @Override
    public String toString() {
        return "Man{" +
                "sex=" + sex +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

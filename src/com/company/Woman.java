package com.company;

public class Woman extends Human {
    Boolean sex;
    String name;
    String surname;
    float height;
    float weight;

    public Woman(Boolean sex, String name, String surname, float height, float weight) {
        super(sex, name, surname, height, weight);
    }

    @Override
    public String toString() {
        return "Woman{" +
                "sex=" + sex +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }


}

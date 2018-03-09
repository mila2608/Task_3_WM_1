package com.company;

import java.util.Random;
import java.util.Scanner;

public class Woman extends Human implements Born {

    public Woman() {
    }

    public Woman(boolean sex, String firstName, String secondName, double weight, double height) {
        super(sex, firstName, secondName, weight, height);
    }

    @Override
    public void toBorn(Object Human) {
        System.out.println("Child is born");
        Child child1 = new Child();
    }

    public static Human relationships(Man m){
return m;
    }

    public static Human bornChild(Human x, Human y) {
        Scanner scanner = new Scanner(System.in);
        String str;
        Woman w = null;
        Man m = null;
        Random r = new Random();
        boolean p = r.nextDouble() * 1.1 < 0.5 ? true : false;
        Child child1 = null;

        if (x == null) {
            child1 = null;
        }

        if (x.getClass() == Woman.class) {
            w = (Woman) x;
            m = (Man) y;

        } else {
            m = (Man) x;
            w = (Woman) y;

        }
        double weightDiff = Math.abs(w.getWeight() - m.getWeight());
        double heightDiff = Math.abs(w.getHeight() - m.getHeight());
        if (p == true) {
            child1.sex = m.isSex();
            child1.weight = (m.getWeight() + 0.1) * weightDiff;
            child1.height = (m.getHeight() + 0.1) * heightDiff;
        } else {
            child1.sex = w.isSex();
            child1.weight = (w.getWeight() + 0.1) * weightDiff;
            child1.height = (w.getHeight() + 0.1) * heightDiff;
        }

        child1.secondName = m.secondName;

        //      System.out.println("Enter child Human First Name");
        //     child1.firstName = scanner.nextLine();
        if (x.getClass() == Woman.class) {
            child1.firstName = "hghghff";
        }

        System.out.println(child1);


       return child1;

    }

}

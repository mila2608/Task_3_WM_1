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

    public static Child bornChild(Human x, Human y) {
        Scanner scanner = new Scanner(System.in);
        String str;
        Child child1 = new Child();
        Random r = new Random();
        boolean p = r.nextDouble() * 1.1 < 0.5 ? true : false;

        double weightDiff = Math.abs(x.getWeight() - y.getWeight());
        double heightDiff = Math.abs(x.getHeight() - y.getHeight());
        if (p == true) {
            child1.sex = true;
            child1.weight = (x.getWeight() + 0.1) * weightDiff;
            child1.height = (x.getHeight() + 0.1) * heightDiff;
        } else {
            child1.sex = false;
            child1.weight = (y.getWeight() + 0.1) * weightDiff;
            child1.height = (y.getHeight() + 0.1) * heightDiff;
        }

        child1.secondName = y.secondName;

        //      System.out.println("Enter child Human First Name");
        //     child1.firstName = scanner.nextLine();

            child1.firstName = "hghghff";


        System.out.println(child1);


            return child1;

    }


}

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
        Human child = null;
        {
        }
    }

    public Human bornChild(Man m) {
        Scanner scanner = new Scanner(System.in);
        String str;
        Random r = new Random();
        Human child = null;
        boolean p = r.nextDouble() * 1.1 < 0.5 ? true : false;
        double weightDiff = Math.abs(this.getWeight() - m.getWeight());
        double heightDiff = Math.abs(this.getHeight() - m.getHeight());

        if (p == true) {
            child = new Man();
            child.sex = true;
            child.weight = Math.rint(100.0 * (m.getWeight() + 0.1) * weightDiff)/100.0;
            child.height = Math.rint(100.0 * (m.getHeight() + 0.1) * heightDiff)/100.0;
        } else {
            child = new Woman();
            child.sex = false;
            child.weight = Math.rint(100.0 * (this.getWeight() + 0.1) * weightDiff)/100.0;
            child.height = Math.rint(100.0 * (this.getHeight() + 0.1) * heightDiff)/100.0;
        }
        child.secondName = m.secondName;
      //       System.out.println("Enter child Human First Name");
     //        child.firstName = scanner.nextLine();
        child.firstName = "New Child First Name";
        System.out.println(child);
        return child;
    }


}

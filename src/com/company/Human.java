package com.company;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Human extends Mammal {
    boolean sex;
    String firstName;
    String secondName;
    double weight;
    double height;

    public Human() {
    }

    public Human(boolean sex, String firstName, String secondName, double weight, double height) {
        this.sex = sex;
        this.firstName = firstName;
        this.secondName = secondName;
        this.weight = weight;
        this.height = height;
    }

    public boolean isSex() {
        return sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public String toString() {
        return "Human{" +
                "sex=" + sex +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public static boolean talk(Human x, Human y) {
        System.out.println("Talk results: ");
        boolean talkResult = false;
        Random r = new Random();
        if (x.getClass() == y.getClass()) {
            if (x instanceof Woman)
                talkResult = true;
            if (x instanceof Man)
                talkResult = r.nextDouble() * 1.1 < 0.5 ? true : false;
        }
        if (x.getClass() != y.getClass()) {
            talkResult = true;
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println(talkResult);
        return talkResult;
    }

    public static boolean sustain(Human x, Human y) {
        System.out.println("Sustain results: ");
        boolean sustainResult = false;
        Random r = new Random();
        if (x.getClass() == y.getClass()) {
            if (x instanceof Woman)
                sustainResult = r.nextDouble() * 1.1 < 0.5 ? true : false;
            if (x instanceof Man)
                sustainResult = r.nextDouble() * 1.2 < 0.56 ? true : false;
        }
        if (x.getClass() != y.getClass()) {
            sustainResult = r.nextDouble() * 1.4 < 0.7 ? true : false;
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println(sustainResult);
        return sustainResult;
    }

    public static boolean spendTime(Human x, Human y) {
        System.out.println("Spend time results: ");
        boolean spendTimeResult = false;
        Random r = new Random();
        double diff = Math.abs((x.getHeight() - y.getHeight()) / y.getHeight()) * 100;
        if ((diff > 10) && (r.nextDouble() * 2.0 < 0.85 ? true : false))
            spendTimeResult = true;
        if ((diff < 10) && (r.nextDouble() * 2.0 < 0.95 ? true : false))
            spendTimeResult = true;
        else spendTimeResult = false;
        System.out.println(spendTimeResult);
        return spendTimeResult;
    }

    public Human relationships(Human h) {
        Woman w = null;
        Man m = null;
        if (h.getClass() == Woman.class)
            return w = (Woman) h;
        else
            return m = (Man) h;

    }

   public static void compatibility(Human x, Human y) {

        Random r = new Random();
        Child child = null;
if (x.getClass() == y.getClass())
    child = null;
else {
    child = Woman.bornChild(x, y);
}
   //    System.out.println(child);

    }

} //class


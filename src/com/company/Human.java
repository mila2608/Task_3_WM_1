package com.company;

import java.util.Random;

public abstract class Human {
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
        boolean talkResult = true;
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

        System.out.println(talkResult);
        return talkResult;
    }

    public static boolean sustain(Human x, Human y) {
        System.out.println("Sustain results: ");
        boolean sustainResult = true;
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

        System.out.println(sustainResult);
        return sustainResult;
    }

    public static boolean spendTime(Human x, Human y) {
        System.out.println("Spend time results: ");
        boolean spendTimeResult = true;
        Random r = new Random();
        boolean p1 = (r.nextDouble() * 1.71 < 0.85 ? true : false);
        boolean p2 = (r.nextDouble() * 1.91 < 0.95 ? true : false);
        double diff = Math.abs((x.getHeight() - y.getHeight()) / y.getHeight()) * 100;
        if ((diff > 10) && (p1) || ((diff < 10) && (p2)))
            spendTimeResult = true;

    //    if ((diff < 10) && (true))
    //        spendTimeResult = true;
        else spendTimeResult = false;
        System.out.println(spendTimeResult);
        return spendTimeResult;
    }

    public static Human relationships(Human x, Human y) {
        Woman w;
        Man m;
        Human child = null;
        if (x.getClass() == y.getClass()) {
            child = null;
            System.out.println("Child is NOT Supported");
        } else {
            System.out.println("New Human Child");
            if (x.getClass() == Woman.class) {
                w = (Woman) x;
                m = (Man) y;
                child = w.Born(m);
            }
            if (x.getClass() == Man.class) {
                w = (Woman) y;
                m = (Man) x;
                child = w.Born(m);
            }
        }
        return child;
    }

    public static String compatibility(Human x, Human y) {
        String str ;
             if (Human.talk(x, y)
                     && Human.sustain(x, y)
                     && Human.spendTime(x, y)
                     && relationships(x,y) != null) {
                 str = "Congratulations!!!";
                 System.out.println(str);
             }
             else {
                 str = "Try again :)";
                 System.out.println(str);
             }
             return str;



    }



} //class


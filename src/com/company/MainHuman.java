package com.company;



import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainHuman {
    public static void main(String[] args) {
        Random r = new Random();
        double rDouble;
        rDouble = r.nextDouble()*10.9;
        ArrayList<Human> humans = new ArrayList<>();
             /*Stream.generate(()-> {
                 return new Man(true, "FN", "SN", rDouble, rDouble);
             })
                    .limit(6)
                    .forEach(System.out::println);*/
      ManFactory<Man1>manFactory = Man1::new;
      Man1 man01 = manFactory.create(true, "FN01", "LN01", 178.4, 87);
 //       System.out.println(man01);

        Man man1 = new Man(true, "Man1 FN", "Man1 SN", 84.5, 182.5);
        Man man2 = new Man(true, "Man2 FN", "Man2 SN", 133.2, 192.1);
        Woman woman1 = new Woman(false, "Woman1 FN", "Woman1 SN", 53.6, 164.8);
        Woman woman2 = new Woman(false, "Woman2 FN", "Woman2 SN", 67.9, 172.3);
        humans.add(man1);
        humans.add(man2);
        humans.add(woman1);
        humans.add(woman2);
// Print ArrayList
       /* for (Object human : humans) {
            System.out.println(human.toString());
        }
        System.out.println();*/

//  Choose randomly a human bean from an ArrayList
        int x = 0;
        int y = 0;
        while (x == y) {
            x = (int) Math.floor(Math.random() * humans.size());
            y = (int) Math.floor(Math.random() * humans.size());
        }
        Human h1 = humans.get(x);
        Human h2 = humans.get(y);
           System.out.println(h1);
          System.out.println(h2);

       Human.compatibility(h1, h2);
     //   h1.relationships(woman1, man2);
     //   Woman.bornChild(man1, woman2);
  //      Human.talk(man1, man2);
   //     Human.sustain(h1, h2);
  //      Human.spendTime(h1, h2);



    } //main

} //class


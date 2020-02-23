package day48;

import java.util.ArrayList;
import java.util.List;

public class Lion extends Mammal {

    @Override
    public void makeNoise(){
        System.out.println("Hey Gorgeous!");
    }

    @Override
    public void drinkMilk(){
        System.out.println("Lion drinks milk");
    }

    public static void main(String[] args) {

        Lion l1 = new Lion();
        l1.drinkMilk();
        l1.makeNoise();

        Animal a1 = new Lion();
        a1.makeNoise();

        List<Integer> lst = new ArrayList<>();


    }
}

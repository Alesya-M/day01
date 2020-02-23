package day30;

import java.util.Arrays;

public class splitPractice {

    public static void main(String[] args) {

        String car = "Lexus-IS-F";
        String[] carSplit= car.split("-");
        System.out.println("carSplit = "+ Arrays.toString(carSplit));
        System.out.println("car = "+car);

        String model = carSplit[1];
        System.out.println("model = "+ model);

//        String model = carSplit[1];
//        System.out.println("model = " + model);
    }
}

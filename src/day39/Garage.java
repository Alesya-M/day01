package day39;

import org.w3c.dom.ls.LSOutput;

public class Garage {
    public static void main(String[] args) {


        Car car1 = new Car();

        car1.model = "X6";
        car1.make = "BMW";
        car1.year= 2020;
        car1.color="Black";
        car1.goFroward();
        car1.AgeOfCar();
        car1.changeColorTo("Blue");

        System.out.println("car1.make = " + car1.make);
        System.out.println("car1.year = " + car1.year);
        System.out.println("car1.color = " + car1.color);

        Car car2 = new Car();

        car2.model = "Civic";
        car2.make = "Honda";
        car2.year= 2003;
        car2.color= "White";
        car2.goFroward();
        car2.AgeOfCar();

        System.out.println("car2.make = " + car2.make);
        System.out.println("car2.year = " + car2.color);



        car2.year = 2020;
        System.out.println("car2 year = "+car2.year);

        //I want to change the color of car2
        car2.color = car1.color;




    }
}

package day44.sub;

import day44.Vehicle;

public class Car extends Vehicle {

    //Default access modifier can only be accessible in the same package
    int mileage;

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.mileage = 39637;
        c1.setYear(2016);
        c1.make= "Corolla";
        System.out.println("c1.make = " + c1.make);

        System.out.println("c1.getYear() = " + c1.getYear());
        System.out.println("mileage "+ c1.mileage);

    }
}

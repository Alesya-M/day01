package day39;

public class Car {
    int year;
    String model;
    String make;
    String color;
    //OR - String model, color, make

    //no static keyword
    //need an object to call it
    //instance methods are tied to the object


    public void goFroward(){
        System.out.println(make+ " is going forward ");
    }

    public void AgeOfCar (){
        System.out.println("Car age is "+ (2020-year));
    }


    public void changeColorTo(String newColor){

        color = newColor;
    }
}



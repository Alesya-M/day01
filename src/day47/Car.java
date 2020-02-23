package day47;

//I dont need to create car object using this class
//I only want this class to be super class to provide
//reusable fields and methods for sub classes
//This class is designed to be super class
public abstract class Car {

    int year;
    String brand;

    public abstract void start();
    public abstract void goForward();
    public abstract void goBackward();
    public abstract void turn(String direction);


}

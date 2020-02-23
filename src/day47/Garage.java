package day47;

public class Garage {
    public static void main(String[] args) {

        //Abstract class con not be instantiated
        //means we can not create an object
        ElectricCar c1 = new ElectricCar();
        c1.start();
        c1.goForward();
        c1.goBackward();
        c1.turn("Right");


        GasCar g1 = new GasCar();
        g1.start();
        g1.goForward();
        g1.goForward();
        g1.turn("Left");
    }
}

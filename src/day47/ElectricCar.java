package day47;

public class ElectricCar extends Car {

    int battery;
    public void start(){
        System.out.println("This is how electric car starts");
    }

    @Override
    public void goForward() {
        System.out.println("Going forward");

    }

    @Override
    public void goBackward() {
        System.out.println("Going backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Turning "+ direction);
    }

    public static void main(String [] args){
        ElectricCar e1 = new ElectricCar();
        e1.start();
    }



}

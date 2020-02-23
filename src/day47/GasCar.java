package day47;

public class GasCar extends Car {
    int gasLevel;

    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void goForward() {
        System.out.println("go forward");
    }

    @Override
    public void goBackward() {
        System.out.println("gp backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("turn "+ direction);
    }
}

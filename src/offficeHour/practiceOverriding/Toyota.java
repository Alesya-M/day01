package offficeHour.practiceOverriding;

public class Toyota  extends car {
@Override
     public void start(){
        System.out.println("Push Button and start");
    }

    public static void main(String[] args) {

        Toyota car1 = new Toyota();
        car1.start();

        car car = new car();

        car.start();

        Jeep car3 = new Jeep();
        car3.start();
    }
}

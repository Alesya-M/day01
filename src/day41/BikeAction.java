package day41;

public class BikeAction {
    public static void main(String[] args) {

        Bike b1 = new Bike("ABC");
        Bike b2 = new Bike();

        //I dont want empty gear when object is created
        //set the gear to 1

        System.out.println(b1.gear);
        System.out.println(b1.speed);
        b1.speed=100;
        System.out.println(b1.speed);

        Bike b3 = new Bike(4);
        System.out.println("b3.gear = " + b3.gear);

        Bike b4 = new Bike(3,55);
        System.out.println("b4.speed = " + b4.speed);
        System.out.println("b4.geat = " + b4.gear);


    }
}

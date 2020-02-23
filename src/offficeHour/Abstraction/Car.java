package offficeHour.Abstraction;

public abstract class Car {

    public abstract void start();
}


class Toyota extends Car{
    @Override
    public void start() {
        System.out.println("Push the button to start");
    }
}


class Jeep extends Car{
    @Override
    public void start(){
        System.out.println("Call mechanic to start");
    }
}


abstract class ElectricCars extends Car{
    public abstract void HasBattery();
    //there 2 abstract methods: start(), HasBattery()
}

class Tesla extends ElectricCars{

    @Override
    public void start() {
        System.out.println("Voice control start");
    }

    @Override
    public void HasBattery() {
        System.out.println("Electric car has Battery");
    }
}


class Test{
    public static void main(String[] args) {

        Jeep obj1 = new Jeep();
        obj1.start();

        System.out.println("-------------------------");
        Toyota obj2 = new Toyota();
        obj2.start();

        System.out.println("-------------------------");
        Tesla obj3 = new Tesla();
        obj3.start();
        obj3.HasBattery();

        System.out.println("-------------------------");


    }


}

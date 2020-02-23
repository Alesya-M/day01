package day48;
//we build relationships between class and interface
//using implements keyword (compared to extends keyword)
//Parent and child relationship
//Plain is a Flyable | inheritance relationship

public class Plane implements Flyable{


    String name;
    int capacity;
    int speed;

    @Override
    public void fly() {
        System.out.println("Plain is flying");
    }

    public static void main(String[] args) {
        Plane p1= new Plane();
        p1.fly();

        System.out.println(Flyable.HAVE_WINGS);
    }
}

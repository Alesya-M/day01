package day55;

public class Casting {

    public static void main(String[] args) {

        Object o = new Dog("Chihuahua");//this is upcasting
        Dog d = (Dog)o;
        d.bark();

        Object o2 = new Object();

        Dog d2 = (Dog)o2;
        d2.bark();

    }
}

package day45;

public class Dog extends Animal{

    public static void main(String[] args) {

        Dog twix=new Dog();
        twix.speak();

    }

    @Override
    public void speak() {
        //SUPER. KEYWORD CAN ONLY BE USED INSIDE INSTANCE METHOD
        //We can use super. or this. as many times as we want
        super.speak();
        System.out.println("BARK!!!");
        super.speak();
        super.speak();
    }


}

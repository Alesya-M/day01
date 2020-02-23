package day45;

public class Apple extends Fruit{

    //If we dont have anu constructor
    //we will get a default constructor
    //and compiler automatically call
    //no arg constructor of super class by inserting super()
        public Apple(){
            super();
        }
//    public Apple(){
//        //I want to reuse the functionality
//        // already written in super class constructor
//        //super();
//        super("test");
//        System.out.println("Message from Apple Constructor");
//    }

    public static void main(String[] args) {
        Apple a1 = new Apple();

    }

}

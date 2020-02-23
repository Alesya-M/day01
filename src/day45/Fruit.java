package day45;

public class Fruit {

    //ALWAYS add no arg constructor in super class
    //to Avoid unnecessary Error of SUB CLASS CALLING
    //SUPER CLASS'S NO ARG CONSTRUCTOR
    public Fruit(){
        System.out.println("No Arg Fruit constructor message");

    }

    public Fruit(String str){
        System.out.println("One Arg Fruit constructor");
    }
}

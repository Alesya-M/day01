package day44;

public class Train extends Vehicle {

    int wagonCount;


    public void makeChoChoSound(){
        System.out.println("Choooo Choooo");
    }

    public static void main(String[] args){
        Train t1 = new Train();
        t1.makeChoChoSound();
        t1.make= "Thomas";
        t1.start();
        t1.goForward();


    }
}

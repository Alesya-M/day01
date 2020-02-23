package day41;

public class Bike {

    int speed ;
    int gear ;
     // Constructor is a block of code
    // that has same name as classname
    //and has no return type
    //no void and no return type
    //if it does not meet the above requirement
    //it is not a CONSTRUCTOR THEN
    //THE ONLY TIME you can call this is:
    //when object is being created

    public Bike(){
        System.out.println("Message from constructor");
        gear= 1;
    }

    public Bike( int newGear){
        gear = newGear;
        //this.gear = newGear;
    }

    public Bike(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public Bike(String str){
        System.out.println("Accept String!");
    }
}

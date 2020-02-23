package offficeHour.practiceOverriding;

public class Jeep extends car{

    public void start(){
        System.out.println("Call mechanic, Oil change, and then jump start.");
    }

    protected int start(int a){
        return 8;
    }

}

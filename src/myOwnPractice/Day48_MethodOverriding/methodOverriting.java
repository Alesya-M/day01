package myOwnPractice.Day48_MethodOverriding;

class student{ //superclass
    public void printName(){
        System.out.println("Hakan");
    }
}

public class methodOverriting extends student { //subclass
    public void print(String str){

    }

    public void print(double a){

    }
    @Override
    public void printName(){
        System.out.println("Alesya");

    }

    public static void main(String[] args) {
        student obj2 = new student();
        obj2.printName();

        methodOverriting obj = new methodOverriting();
        obj.printName();


    }}

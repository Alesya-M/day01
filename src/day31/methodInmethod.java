package day31;

public class methodInmethod {
    public static void main(String[] args) {
        //finallyAwake
        finallyAwake();


    }

    public static void finallyAwake(){

        dailyRoutine();
        coffee();
    }

    public static void dailyRoutine(){
        System.out.println("Open your eyes");
        System.out.println("Brush teeth");
        System.out.println("Drink coffee");
        System.out.println("-----------------------");
    }

    public static void coffee(){
        System.out.println("Grind beans");
        System.out.println("Pour over");
        System.out.println("Milk and cream");
        System.out.println("-----------------");
    }
}

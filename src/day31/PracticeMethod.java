package day31;

public class PracticeMethod {

    public static void dailyRoutine(){
        System.out.println("Open your eyes");
        System.out.println("Brush teeth");
        System.out.println("Drink coffee");
    }

    public static void coffee(){
        System.out.println("Grind beans");
        System.out.println("Pour over");
        System.out.println("Milk and cream");
    }

    public static void Atwork(){
        System.out.println("Look at the schedule");
        System.out.println("go make coffee");
        System.out.println("instagram");
    }

    public static void AtHome(){
        System.out.println("Eat");
        System.out.println("Make a bath");
        System.out.println("Watch youtube");
    }

    public static void sunday(){
        System.out.println("course");
        System.out.println("go make coffee");
        System.out.println("laundry");
    }

    public static void IloveJava300Times(){

        for (int i = 1; i <=300; i++) {
            System.out.println("I love Java | ");

        }
        System.out.println();

    }






    public static void main(String[] args) {

        dailyRoutine();
        coffee();
        Atwork();
        AtHome();
        IloveJava300Times();
        sunday();

    }


}

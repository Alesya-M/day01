package day11;

import day10.Switch;

public class wakeUpTask {

    public static void main(String[] args) {

        String targetOption = "Bd";

        switch(targetOption){

            case "Bd":
                System.out.println("You turned the light in the bedroom");
                break;
            case "Lr":
                System.out.println("You turned the light in the living room");
                break;
            case "Ki":
                System.out.println("You turned the light in the kitchen");
                break;
            case "Ha":
                System.out.println("You turned the light in the hallway");
                break;
            default:
                System.out.println("Call electrician");
                break;


        }
    }
}

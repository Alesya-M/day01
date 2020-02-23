package day12;

import java.util.Scanner;
public class season {

    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("Enter season,please.");
        String season= scan.nextLine();

        if (season.equalsIgnoreCase("Spring")){
            System.out.println("Flower blooms!");
        }else if (season.equalsIgnoreCase("Summer")){
            System.out.println("Swimming, sun, ice-cream!");
        }else if (season.equalsIgnoreCase("Fall")){
            System.out.println("Pumpkin spice latte, wool blanket, colorful leaves!");
        }else if (season.equalsIgnoreCase("Winter")){
            System.out.println("New Year, orchid blooming on the window seal, snow");
        }else{
            System.out.println("No such season!");
        }



    }

}

package day27;

import day03.EscapeCharacter;

public class ArrayTask {

    public static void main(String[] args) {


        //TASK02
        //write a program that can find the minimum number from an int array
        //Do not use Sort method

        int[] scores={100, -99, -1000, 200, 5000, 1, 0};
        int min = scores[0]; // or int min = 999999999;
        for (int x = 0; x < scores.length; x++) {
            if(min>scores[x]){
                min = scores[x];
            }
            
        }
        System.out.println("minimum number "+ min);



        int secondMin = scores[0];

        for (int i = 0; i < scores.length; i++) {
            if(scores[i]== min){
                continue;
            }

            if(secondMin > scores[i]){
                secondMin = scores[i];
            }

        }
        System.out.println("second minimum number is " +secondMin);

        int thirdMin = scores[0];
        for (int y = 0; y < scores.length; y++) {
            if(scores[y]==min || scores[y]==secondMin){
                continue;
            }
            if(thirdMin>scores[y]){
                thirdMin=scores[y];
            }

        }

        System.out.println("Third minimum number is "+thirdMin);
    }
}

package day19;

public class FinfingtheCountOfSomething {

    public static void main(String[] args) {


         //from 1-100 print out all the numbers can be divided by 15 without remainder
        //from 1-100 count how many numbers can be divided by 15

        int counter = 0 ;
        for (int i = 1; i <=100 ; i++) {

            if(i%15==0){
                //System.out.print(i+ ",");
                ++counter;

            }

        }
        System.out.println("counter= " + counter );

    }
}

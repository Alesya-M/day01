package day27;

public class MultiDArrayTask {
    public static void main(String[] args) {

        int[][] numbers ={{12,11,10,19},{19,20,15}};
        int max = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                if(max<numbers[i][j]){
                    max = numbers[i][j];

                }

            }

        }
        System.out.println("MAX NUMBER: "+ max);


        int max2 = numbers[0][0];
        for(int[] each1DArray : numbers ){
            for (int eachInt: each1DArray){

                if(max2<eachInt){
                    max2= eachInt;
                }
            }

        }
        System.out.println("MAX NUMBER : "+ max2);


        //Finding the minimum number:

        int min = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(min>numbers[i][j]){
                    min=numbers[i][j];

                }

            }

        }
        System.out.println(min);


        System.out.println("======================");





    }
}

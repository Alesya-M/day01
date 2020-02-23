package day20;

public class sumOfNumbers {

    public static void main(String[] args) {

        int sum = 0 ;
        int sumOfEven=0;

        for (int i = 10; i <=100 ; i++) {

            if (i%2==1){

                //System.out.println(i);
                sum=sum+i;

            }else if(i%2==0){

                sumOfEven=sumOfEven+i;
            }

        }
        System.out.println("Odd numbers sum: "+ sum);
        System.out.println("Even numbers sum: " + sumOfEven);

    }
}

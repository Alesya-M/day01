package day17;

public class CountingOddandEven {

    public static void main(String[] args) {

        int num = 0;

        System.out.println("EVEN NUMBERS:");

        while(num<=50){

            System.out.print(num + " ");
            num +=2;

        }

        System.out.println();
        System.out.println("ODD NUMBERS:");
        int cnt3 = 0;
        while (cnt3<=50){

           if (cnt3%2==0){
               System.out.println(cnt3+ " is even number");
           }else {
               System.out.println(cnt3+" is odd number");
           }
           ++cnt3;
        }



    }
}

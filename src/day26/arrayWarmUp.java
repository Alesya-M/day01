package day26;

public class arrayWarmUp {

    public static void main(String[] args) {
        //1ST WAY CREATING ARRAY
        int num []= new int[4];
        num[0]=4;
        num[1]=5;
        num[2]=6;
        num[3]=1;
        int size = num.length;
        int lastIndex = size -1;
        int lastItemValue = num[lastIndex];
        num[0]= num[0]+3;
        System.out.println("Value - "+ num[0]);
        num[1]=num[3];
        System.out.println(num[1]);

        //2ND WAY TO CREATE AN ARRAY

        int[] myNumbers2 = new int[]{10,40,30,7};


    }
}

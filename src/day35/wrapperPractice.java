package day35;

import java.util.Arrays;

public class wrapperPractice {
    public static void main(String[] args) {

        float f6 =Float.parseFloat("3.14f");
        System.out.println(f6);

        String sentence = "I bought 3 tomatoes and the price was 3,14 each";
        String [] array= sentence.split(" ");
        int count = Integer.parseInt(array[2]);
        String priceString = array[array.length - 2];
        priceString = priceString.replace(",", ".");
        double price = Double.parseDouble(priceString);

        System.out.println("Total price is " + (count * price));
//        if(array[array.length-2].contains(",")){
//            array[array.length-2].replace(",",".");
//        }
//       double price= Double.parseDouble(array[array.length-2]);
//       double sum=count*price;
//       System.out.println("Total price is "+sum);

//        System.out.println(Integer.parseInt(allWords[2])*Double.parseDouble(allWords[allWords.length-2]));




//        String sentence =  "I bought 3 tomato and the price was 3.14 each";
//        String [] arr = sentence.split(" ");
//        float count = Integer.parseInt(arr[2])*Float.parseFloat(arr[8]);
//        System.out.println("count = " + count);
    }
}





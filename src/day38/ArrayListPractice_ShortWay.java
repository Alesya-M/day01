package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice_ShortWay {

    public static void main(String[] args) {

        //create List of 6 double in SHORT WAY, we will just read them
        // and will not add or remove item

        List<Double> prices = Arrays.asList(9.99,0.99, 5.99, 5.55, 3.76, 8.99, 0.99 ) ;
//        prices.add(12.8);
//        prices.remove(0);
        System.out.println("prices = " + prices);
        
        int count = 0 ;
        for (Double each : prices){
            if(each>5){
                count++;
            }
        }
        System.out.println("count = " + count);

//        do{ newPrices.remove(0.99)} while( !newPrices.contains(0.99))

        //I want to add 2 more prices(does not have to be the same list)

        ArrayList<Double> newPrices = new ArrayList<>(prices);
       // newPrices.add(199.99);
        newPrices.remove(0.99);
        System.out.println("newPrices = " + newPrices);

        //Create an ArrayList Object in one shot with many items so we can add or remove

        ArrayList<Double> oneShotPrice
                = new ArrayList<>( Arrays.asList(9.99,0.99, 5.99, 5.55, 3.76, 8.99, 0.99 )); //LIST OBJECT
        
        oneShotPrice.add(1,100.99);
        oneShotPrice.remove(2);
        System.out.println("oneShotPrice = " + oneShotPrice);

     


        


    }
}

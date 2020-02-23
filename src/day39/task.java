package day39;

import java.util.ArrayList;
import java.util.*;

public class task {
    public static void main(String[] args) {

        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                                                "iPhone 6s Plus,549,22.88",
                                                "iPhone X,1149,56.16",
                                               "MacbookPro,1499.99,79.49",
                                               "ThumbDrive,39.99,2.68",
                                              "Beats HeadPhones,349.99,15.12",
                                              "Mouse,79.99,8.98",
                                             "Charger,39.99,4.56",
                                               "iPad,429,18.31",
                                              "Dyson Vacuum,399,16.25",
                                           "TV,2199,89.49",
                                            "Apple Watch,559,21.18") );

        System.out.println(productLst.size());

        for(String eachProduct : productLst ){

            String namePart = eachProduct.split(",")[0];
            System.out.println("eachProduct = " + namePart);
        }

        for (int i = 0; i < productLst.size(); i++) {
            String namePart = productLst.get(i).split(",")[0];
            System.out.println("eachProduct name = " + namePart);

        }

        //Task 2 : print all the prices more than 500

        for(String eachProduct : productLst){

            double price = Double.parseDouble(eachProduct.split(",")[1]);

            if(price>500){
                System.out.println("price = "+ price);
            }
        }

        //Task 3 print average price

        double sum =0;
        double average = 0;

        for(String eachProduct : productLst) {

            double price = Double.parseDouble(eachProduct.split(",")[1]);
            sum = sum + price; // sum+=price ;
        }
        average = sum/productLst.size();
        System.out.println("sum = "+ sum);
        System.out.println("average = "+ average);




        String itemDetails = "iPhone 6s,449,18.71";
        String[] itemSplitArr = itemDetails.split(",");

        String name = itemSplitArr[0];
        System.out.println("name = " + name);

        double price = Double.parseDouble(itemSplitArr[1]);
        System.out.println("price = " + price);

        double monthly = Double.parseDouble(itemSplitArr[2]);
        System.out.println("monthly = " + monthly);


        System.out.println("item name = " + itemDetails.split(",")[0]);
        System.out.println("item price = " + Double.parseDouble(itemDetails.split(",")[1]));
        System.out.println("item monthly = " + Double.parseDouble(itemDetails.split(",")[2]));

//        System.out.println("item name = " + itemDetails.split(",") [0] );
//        System.out.println("item price = " + itemDetails.split(",") [1] );
//        System.out.println("item monthly = " + itemDetails.split(",") [2] );

         // Task 4 : print all the items name that has less than 20$ monthly payment.
        for (String eachProduct : productLst) {

            String name2 = eachProduct.split(",")[0];
            double monthly2 = Double.parseDouble(eachProduct.split(",")[2]);

            if (monthly < 20) {
                System.out.println(name + " " + monthly);
            }

        }

//         * Task 5 : Print the monthly payments of all the iPhone no matter what model.
        for (String eachProduct : productLst) {

            String name1 = eachProduct.split(",")[0];
            double monthly1 = Double.parseDouble(eachProduct.split(",")[2]);

            if (name.contains("iPhone")) {
                System.out.println(name + " " + monthly);
            }

        }

//         * Task 6 : Print all information about most expensive items.

        for (String eachProduct : productLst) {

            String name2 = eachProduct.split(",")[0];
            double monthly2 = Double.parseDouble(eachProduct.split(",")[2]);

            if (name.contains("iPhone")) {
                System.out.println(name + " " + monthly);
            }

        }

//         * Task 6 : Print all information about one of the most expensive item.
//        for(String eachProduct : productLst){
//
//            double price1 = Double.parseDouble(eachProduct.split(",")[1]);
//            if(price>=maxPrice){
//                maxPrice = price;
//            }
//        }
//        System.out.println("maxPrice = " + maxPrice);

        double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]) ;

        for (int i = 0; i < productLst.size(); i++) {
            String priceStr = productLst.get(i).split(",")[1];
            //this is how we turn priceString into double data type
            double price3 = Double.parseDouble(priceStr);

        }


    }


}

package day56;

import java.util.ArrayList;
import java.util.List;

public class ProductListPractice {

    public static void main(String[] args) {

        List<Product>productList= new ArrayList<>();
        
        productList.add( new Product("Macbook Pro", 2999) ) ;
        productList.add( new Product("Macbook Air", 1299) ) ;
        productList.add( new Product("Iphone X", 999) ) ;
        productList.add( new Product("Sony TV", 499) ) ;
        productList.add( new Product("Iphone XL", 1299) ) ;
        productList.add( new Product("Sumsung 10", 499) ) ;

        System.out.println("productList.size() = " + productList.size());

        Product sony = new Product("Sony TV",499);
        boolean result = productList.contains(sony);
        System.out.println("Has Sony TV, 499 or not result = "+ result);

        System.out.println("productList.indexOf(sony) before = " + productList.indexOf(sony));
        productList.remove(sony);

        System.out.println("Has Sony TV after removing? "+ productList.contains(sony));
        System.out.println("productList.indexOf(sony) after = " + productList.indexOf(sony));



        boolean result2 = productList.contains(new Product("Sony TV",499));
        System.out.println("Has Sony TV with price 499 or not result = "+ result2);

        //        boolean result = false;
//        for( Product each : productList){
//////            if(each.getName().equals("Sony TV")& each.getPrice()==499){
//////                result = true;
//////            }
//////            if( each.equals(new Product("Sony TV",499))){
//////                result = true;
//////            }
////        }



    }
}

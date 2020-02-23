package day13.day14;

public class Warm_up_AmazonShippingCalculator2 {

    public static void main(String[] args) {

        boolean doYouWantToSHop = true ;
        String preference = "Store" ;

        if (doYouWantToSHop==true){ //if(youWantToSHop)

            if( preference.equals("Store") ){
                System.out.println("Going shopping to the store");
            }else {
                System.out.println("Going shopping online");
            }

        }else  if(doYouWantToSHop==false){
            System.out.println("Good job! Stay home and code");
        }
    }
}

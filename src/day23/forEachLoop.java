package day23;

public class forEachLoop {

    public static void main(String[] args) {

        double [] prices = {99.23, 11.99, 100.23, 99.99, 56.34} ;

        //for each loop syntax
        // for ( dataTypeOfYourArray  variableNameForEachItem : yourArrayVariable ) {
        //
        //          do something with your array itens
        //}

        for (int x = 0; x < prices.length; x++){

            double eachPrice = prices[x] ;
            System.out.println("eachPrice = " + eachPrice);

        }

        //FOR EACH LOOP CAN ONLY BE USED FOR ARRAY
        //THERE IS NO INFINITE LOOP AT ALL

        for (double eachPrice  : prices ){

            System.out.println("eachPrice = " + eachPrice);

        }


    }
}

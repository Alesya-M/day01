package offficeHour;

public class array {

    public static void main(String[] args) {

        //1.7 print out only those items end with letter e

        String [] fruits = {"apple","banana","grape","strawberry","blueberry","kiwi"};

             //index        //  0       1        2         3           4          5
        //fruits[3].endsWith("e");
        //length: return the total number of elements

        for (int i = 0; i < fruits.length; i++) {  //i: 0, 1, 2, 3, 4, 5
            String str = fruits[i];
            //System.out.println(str);
//
//            if(str.endsWith("e")){
//                System.out.println(str);
//            }

            if(!str.endsWith("e")){
                continue;
            }
            System.out.println(str);

            System.out.println("=========================================");
            /*
            for(Varibale: Collection of data) {
                 statements;
                 }
                 variable MUST be representing each elements of the collection of data.

             */

            for (String eachFruit : fruits){

               char lastChar = eachFruit.charAt(eachFruit.length()-1);//represents the last character of each string
               if(lastChar == 'e'){
                   System.out.println(eachFruit);
               }
            }

            System.out.println("PRINTING ONLY 3 CHARACTERS OF EACH ITEM!");

            for (int j = 0; j < fruits.length; j++) {

                String last3 = fruits [j].substring(fruits[j].length()-3, fruits[j].length() );
                System.out.println( last3);

            }


            System.out.println("FOR EACH AND CHAR AT--LOOP");

            for(String eachFruit : fruits ) {

                //String last3= eachFruit.substring(eachFruit.length()-3 );
                String last3 = "" + eachFruit.charAt(eachFruit.length()-3) + eachFruit.charAt(eachFruit.length()-2)+ eachFruit.charAt(eachFruit.length()-1);

                System.out.println(last3);
            }
            System.out.println("=============================================");


            float[] prices = { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  };
            /// INDEX:       0         1         2         3         4        5
                    float max = prices[0];
                  for ( float eachPrice : prices ) {
                      if(eachPrice > max ){
                          max = eachPrice ;
                      }
                  }

            System.out.println(max);
            System.out.println("=============================================");

               float Max = prices[0];

               for (float eachPrice : prices ){
                   if(eachPrice< Max){
                       continue;
                   }
                   Max = eachPrice;

               }

            System.out.println(Max);

            System.out.println("=============================================");

            //Finding the second maximum number from the array
            float SecondMax = prices[0]; //store the second max number
            for (float eachPrice : prices ){
                if(eachPrice > SecondMax && eachPrice < 4.65){
                    SecondMax = eachPrice;

                }

            }
            System.out.println(SecondMax);

            // find the index number of second maximum number

            for (int s = 0; s < prices.length; s++) {

                if(prices[i] == SecondMax){

                    System.out.println("index numer of "+ SecondMax+" is"+ i);

                }

            }















        }


    }
}

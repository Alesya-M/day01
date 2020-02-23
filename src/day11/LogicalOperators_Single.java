package day11;

public class LogicalOperators_Single {

    public static void main(String[] args) {

        System.out.println( 7>5 && 1>7 );//DOUBLE DOES NOT GOES TO THE NEXT STATEMENT IF THE FIRST IS FALSE
        System.out.println( 5>5 && 1>7 );
        System.out.println( 1>5 && 9>7 );


        System.out.println( 7>5 & 1>7 );// SINGLE GOES TO THE NEXT STATEMENT NO MATTER WHAT
        System.out.println( 5>5 & 1>7 );
        System.out.println( 1>5 & 9>7 );


        //System.out.println(9/0); //Error! cannot divide by zero

        //System.out.println(9/0 == 3);

        System.out.println(5>9 && 9/0==3);

        System.out.println(10>5 );


    }
}

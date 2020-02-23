package day11;

public class LogicalNotOperator {

    public static void main(String[] args) {

        //LOGICAL NOT OPERATOR !

        //It cannot be used with any other data type other then boolean

        System.out.println( true );
        System.out.println( false );
        System.out.println( ! true );
        System.out.println( ! false );

        boolean isRecording = false;
        System.out.println( ! isRecording );// !- makes it the opposite value

        //boolean expression is any expression that result in a boolean expression
        //for example 7>5, x>10, y==20, x>10 && x<100


        System.out.println("the result of ! (7>5) is ");
        System.out.println( !(7>5) );

        int x = 7;
        System.out.println("result of x>10 is ");
        System.out.println( x>10 );
        System.out.println("result of !(x>10) is ");
        System.out.println( !(x>10) );
        //NEGATING THE RESULT
        // !(x>10) -->> x<10




    }
}

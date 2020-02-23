package day26;

public class ArrayTask_NumberTest {

    public static void main(String[] args) {

        int scores[] = { 156, 101, 76, 187, 87, 110 };
        //create a variable called finalResult to store
        //your result of checking if every number in this array is more than 100 or not

        String finalResult = ""; //if all numbers are more than 100 then make it yes, if not make it no.

        int cntMoreThan100 = 0;
        for( int eachNum : scores ){

            if ( eachNum>100){
                ++cntMoreThan100;
            }
        }
        System.out.println("cntMoreThan100 = " +cntMoreThan100);

        if(cntMoreThan100==scores.length){
            finalResult = "YES";
        } else {
            finalResult = "NO";

        }
        System.out.println("finalResult = "+ finalResult);

        for (int eachNum : scores){

            if(eachNum<= 100 ){
                finalResult= "NO";
                break;
            }
        }
        System.out.println("finalResult = "+ finalResult );

    }
}

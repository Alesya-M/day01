package day34;

public class methodWithNumbers {
    public static void main(String[] args) {
        System.out.println(buil3DigitNumber(6,4,0));
        int result1= buil3DigitNumber(6,4,0);
        int result2= buil3DigitNumber(6,14,0);

        System.out.println("result1+result2= "+(result1+result2));
        System.out.println(result1+result2+" = result1+result2");

    }

    public static int buil3DigitNumber(int digit1, int digit2, int digit3){

        if(digit1<0 || digit1>9){
            digit1=0;
        }
        if(digit2<0 || digit2>9){
            digit2=0;
        }
        if(digit3<0 || digit3>9){
            digit3=0;
        }

        int number =digit1*100+digit2*10+digit3;
        return number;
    }
}

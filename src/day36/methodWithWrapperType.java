package day36;

public class methodWithWrapperType {

    public static void printTheDoubledValue(int x){

        System.out.println("after doubling x = " + (x*2));
    }

    public static void addOneHundred(int x){
        x = x + 100;
        System.out.println(x);
    }

    public static void main(String[] args) {
        printTheDoubledValue(10); //method with int

        printTheDoubledValue(new Integer(10)); //passing Integer object
        //Auto-Unboxing

        int num = 7 ;
        addOneHundred( num ) ;

        addOneHundred(25);
        int num1 = 10 ;
        addOneHundred(num);

        System.out.println(num1);
    }
}

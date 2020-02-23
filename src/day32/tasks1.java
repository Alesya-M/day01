package day32;

public class tasks1 {
    public static void main(String[] args) {
        skipCountBy3from0To50();
        numbCompar(3,5);
        stringRepeater("Alesya", 5);
        skipCountBy3from50To0();
        print1ToX(7);
    }

    public static void numbCompar(int num1, int num2){

        if (num1>num2){
            System.out.println("num1 is more than num2");
        }else if(num2>num1){
            System.out.println("num2 is more than num1");
        }else if(num1==num2){
            System.out.println("numbers are equal");
        }
        System.out.println("---------------");
    }

    public static void stringRepeater(String strRepeat, int count){

        for (int i = 0; i < count; i++) {
            System.out.println(strRepeat);

        }
        System.out.println("---------------");
    }

    public static void skipCountBy3from0To50(){
        for (int x = 0; x <= 50;) {
            x=x+3;
            System.out.print(x+" ");

        }
        System.out.println("---------------");
    }

    public static void skipCountBy3from50To0(){
        for (int x = 50; x >= 0;) {

            System.out.print(x+" ");
            x=x-3;

        }
        System.out.println("---------------");
    }

    public static void print1ToX(int x){
        for (int i = 1; i <=x ; i++) {
            System.out.print(i);
        }
        System.out.println();
    }

}

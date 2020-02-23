package offficeHour;

import java.util.Arrays;

public class Muhtar12_30 {
    public static void main(String[] args) {

        int a= 10;
        Integer A = a;

        float f = 0.5f;
        //Double F =f;

        Double num1= 0.5;
        Short num3 = 45;
        Integer num4 = 100;
        double num2 = num4;

        Long number1 = 100l;
        Long number = (long)100;

        Float f1 = 100.0f;
        double d1=f1;

        System.out.println(Byte.MAX_VALUE);//max value of byte primitive
        System.out.println(Byte.MIN_VALUE);//min value of byte primitive

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //PARSE METHOD
        String str1 = "123";
        int result = Integer.parseInt(str1);
        System.out.println(result+1);

        String str2 = "true";
        boolean r1 = Boolean.parseBoolean(str2);
        System.out.println(r1);

        String str3 = "FalSe"; //PARSE METHODS ARE NOT CASE SENSITIVE!!!
        boolean r2=Boolean.parseBoolean(str3);
        System.out.println(r2);

        String str4 = "yes";
        boolean r3 = Boolean.parseBoolean(str4);//If you get the value that is different from TRUE OR FALSE
                                                // WILL ALWAYS GET "FALSE"!!!
        System.out.println(r3);

        String s1 = "100.5";
        Double c1 = Double.parseDouble(s1);//Primitive to Double = AUTO BOXING
        Double c2 = Double.valueOf(s1);

        System.out.println(c1+1);
        System.out.println(c2);

        String s2 = "tRuE";
        Boolean b1 = Boolean.valueOf(s2);
        System.out.println(b1);

        int[] arr = new int[3];
        System.out.println(Arrays.toString(arr));

        double[] arr2 = new double[3];
        System.out.println(Arrays.toString(arr2));

        Double[] arr3 = new Double[3];
        System.out.println(Arrays.toString(arr3));//DEFAULT VALUE IS NULL!!!!

        System.out.println(addNum(300,5));
        System.out.println(addNum(4.5,5.8));

    }

    public static int addNum(int a, int b) {
        return a + b;
    }

    public static double addNum(double a, double b){
        return a+b;
    }


}

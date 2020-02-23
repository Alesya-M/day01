package day03;

public class PrimitivesPractice {

    public static void main(String[] args) {

        byte letterCount = 26;
        System.out.println("The letter count is" + letterCount);

        short sheepCount = 300;
        System.out.println("The sheep count is" + sheepCount);

        int  catCount = 20;
        System.out.println("The cat Count is" + catCount);

        long mileToSun = 10000000L;
        System.out.println("The mile to Sun is" + mileToSun);

        float priceOfBanana = 1.99f;
        System.out.println("The price of Banana is" + priceOfBanana);

        float priceOfPotato = 2.49F;
        System.out.println("The price of Potato is" + priceOfPotato);

        //upper case or lower case does not matter.
        double priceOfIpad1 = 355.99d;
        System.out.println("The price of Ipad1 is" + priceOfIpad1);

        double priceOfIpadPro = 1024.99D;
        System.out.println("The price of Ipad Pro is" + priceOfIpadPro);

        //compiler assumes it's a double so it's not required to have d
        //However for good programming habit, add them always.
        double priceOfMac = 2299.99 ;
        System.out.println("The price of Mac" + priceOfMac);
        //If you have a whole number by itself, compiler automatically assume it's an int.


        }
    }


package day22;

public class arrayPractice1 {

    public static void main(String[] args) {

        double [] prices = new double[5];
        prices[0]= 2.46;
        prices[1]= 12.96;
        prices[2]= 992.1;
        prices[3]= 500;
        prices[4]= 65.123;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);

        char[] nameChar =new char[5];
        nameChar[0] = 'A';
        nameChar[1] = 'K';
        nameChar[2] = 'B';
        nameChar[3] = 'A';
        nameChar[4] = 'R';

        System.out.println(nameChar[0]);
        System.out.println(nameChar[1]);
        System.out.println(nameChar[2]);
        System.out.println(nameChar[3]);
        System.out.println(nameChar[4]);
        //This will actually print the content and not memory address
        //AND THIS IS ONLY FOR CHAR ARRAY. ANYTHING ELSE WILL PRINT THE ADDRESS!
        //EXCLUSIVELY FOR CHAR ARRAY!
        System.out.println( nameChar );//!!!

        boolean [] yesNo =new boolean[3];
        System.out.println( yesNo[0]);
        System.out.println( yesNo[1]);
        System.out.println( yesNo[2]);

        yesNo[0]= true;
        yesNo[1]= false;
        yesNo[2]= 10>70;

        System.out.println( yesNo[0]);
        System.out.println( yesNo[1]);
        System.out.println( yesNo[2]);







    }
}

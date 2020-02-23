package day07;

public class Casting {

    public static void main(String[] args) {

        //int num = 10 ;

        double bigNum = 10 ;
        int smNum = (int) bigNum;
        System.out.println(bigNum);

        int mnum = (int) 10.99;

        System.out.println(mnum);

        int r = 35;
        double t = (double) r;

        System.out.println(t);
        System.out.println(r);

        long earthToMoon = 500001; //1000L

        int small = (int) earthToMoon;
        System.out.println(small);

        long n1 = 900007000;
        int n2 = (int) n1;
        System.out.println( n2 );


        int MedCup = 100 ;

    }
}

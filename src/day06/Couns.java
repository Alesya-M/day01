package day06;

public class Couns {

    public static void main(String[] args) {

        int cent = 200 ;
        cent -= 74; //126 cent
        int quarter = cent/25 ;//126/25
        int penny = cent%25;
        System.out.println(quarter);
        System.out.println(penny);

        int dime = cent / 10;// 126/10
        int penny2 = cent%10;// remainder

        System.out.println(dime);
        System.out.println(penny2);

    }
}

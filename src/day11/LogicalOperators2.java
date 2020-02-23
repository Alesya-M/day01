package day11;

public class LogicalOperators2 {

    public static void main(String[] args) {

        int x = 55;

        System.out.println( x>100 || x<10);
        System.out.println(x>10 && x<60);

        System.out.println(x==50 || x==51 || x==55 );
                            //TRUE&&true    false //true||false ==>> true
        System.out.println(x>50 && x !=52 || x==57); // ==is checking for equality // != is checking for inequality

        System.out.println( false || true && false );
    }
}

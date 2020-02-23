package day49;

public class Main {
    public static void main(String[] args) {

        Juicy.squeeze();
        
        Tesla t1 = new Tesla(2020,"S",444 );
        t1.Charge();
        t1.selfDrive();
        t1.start();
        t1.goForward();
        System.out.println("t1 = " + t1);
        
    }
}

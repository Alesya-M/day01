package day55;

public class TaxiAction {

    public static void main(String[] args) {

        Engine en = new Engine("V6", 400);

        Driver d = new Driver("Pedro",1234);

        Taxi t1 = new Taxi(101,en, d );

        System.out.println("t1.toString() = " + t1.toString());
        Engine z = t1.en;
        System.out.println(t1.dr.name);
        System.out.println(t1.dr.name.charAt(0));
    }


}

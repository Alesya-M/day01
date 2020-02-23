package day13.day14;

public class Review2 {

    public static void main(String[] args) {

        String str = "I like Pumpkin" ;
        System.out.println("str");
        System.out.println(str);

        boolean startedWithI = str.startsWith("I");
        System.out.println("started With I = " + startedWithI);

        boolean endWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("endWithPumpkin = " + endWithPumpkin );

    }
}

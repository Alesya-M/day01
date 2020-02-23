package day13.day14;

public class Review {

    public static void main(String[] args) {
       String str = "I like Pumpkin";

        //System.out.println( str.equals("pumpkin"));

        System.out.println(" Does it contain Pumpkin?");

        System.out.println(str.contains("Pumpkin"));
        boolean gotPumpkin = str.contains("Pumpkin");
        System.out.println("gotPumpkin= " + gotPumpkin);


    }
}

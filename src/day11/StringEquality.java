package day11;

public class StringEquality {

    public static void main(String[] args) {

        //Data type- JUST THE TYPE ALWAYS start with the upper case

        String name = "Rabia";// STRING LITERAL
        String name2 = new String("Rabia");
        String name3= "Rabia";

        System.out.println(name);
        System.out.println(name2);

        System.out.println(name==name2);
        System.out.println(name==name3);

        System.out.println("Using equals method");
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
    }
}

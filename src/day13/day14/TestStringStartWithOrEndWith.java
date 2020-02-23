package day13.day14;

public class TestStringStartWithOrEndWith {

    public static void main(String[] args) {

        String name = "Muge";

        //check if the String start with another string

        System.out.println(name.startsWith("Mu"));
        System.out.println(name.startsWith("Mac"));
        System.out.println(name.startsWith("mu"));

        //check is a String end with another string

        System.out.println(name.endsWith("ge") );
        System.out.println(name.endsWith("gee"));
        System.out.println(name.endsWith("e"));
        System.out.println(name.endsWith("E"));

    }
}

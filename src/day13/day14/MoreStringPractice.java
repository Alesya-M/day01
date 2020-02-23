package day13.day14;

public class MoreStringPractice {

    public static void main(String[] args) {

        String name = "Pumpkin";

        System.out.println(name);
       // name = "Cat";

        //System.out.println(name);
        //String is immutable, once created it cannot be changed
        //Any String actions/methods that looks like changing th variable
        //actually creating a new String object.

        name.toUpperCase();
        System.out.println(name);

        System.out.println(name.toUpperCase());

        name=name.toUpperCase();
        System.out.println(name);


    }
}

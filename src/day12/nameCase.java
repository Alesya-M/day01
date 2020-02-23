package day12;

public class nameCase {

    public static void main(String[] args) {

        String name="Alesya";
        boolean name2 = name.equals("ALESYA");
        System.out.println(name2);

        boolean name3 = name.equalsIgnoreCase("AlEsYa");
        System.out.println(name3);
    }
}

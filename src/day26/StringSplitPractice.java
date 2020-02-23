package day26;

import java.util.Arrays;

public class StringSplitPractice {

    public static void main(String[] args) {
        String students = "Kolya, Ruslan, Gena, Temur, Dima, Kirill, Artem" ;
        students = students.replace(" ", "");
        System.out.println("students = " + students);

        String []namesArrays1 = students.split(",");
        System.out.println(Arrays.toString(namesArrays1));
        System.out.println("length of namesArrays1 is "+ namesArrays1.length);


        for (int x = 0; x <namesArrays1.length ; x++) {


            String name = namesArrays1[x];
            System.out.println("Spelling = "+name);

            for (int i = 0; i < name.length(); i++) {

                System.out.print(name.charAt(i) + "-");

            }
            System.out.println();
        }

    }
}

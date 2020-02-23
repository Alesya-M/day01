package day29;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringPractice3 {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark J Kent";

        String newName[]=hero1.split("-");
        String heroCode = newName[0];
        String fullName = newName[1];
        System.out.println(newName[0]);
        System.out.println(newName[1].length());
        String stars= "";

        for (int i = 0; i < newName[1].length(); i++) {

            stars= stars+ "*";

        }
        System.out.println(stars);
        newName[1]=stars;

        System.out.println(Arrays.toString(newName));

    }
}

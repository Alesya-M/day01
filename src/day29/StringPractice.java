package day29;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark Kent";
        String[]heroSplitted = hero1.split("-");
        System.out.println("heroSplitted = "+ Arrays.toString(heroSplitted));

        String heroCode = heroSplitted[0];
        String fullName = heroSplitted[1];

    }
}

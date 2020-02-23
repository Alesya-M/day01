package day29;

import java.util.Arrays;

public class otherVersion {
    public static void main(String[] args) {
        // assume this can be different hero
        String hero1 = "Superman-Clark J Kent";
        // hide this hero identity
        //String heroX = "Superman-************";
        // OR one the star is generated , replace full name with Stars
        String[] heroSplitted = hero1.split("-");
        String heroCode = heroSplitted[0];
        String fullName = heroSplitted[1];
        int nameCharCount = fullName.length();
        String stars = "";
        for (int i = 0; i < nameCharCount; i++) {
            stars = stars + "*"; //  stars += "*";

        }
        System.out.println(fullName);
        System.out.println(stars);
        String heroX = heroCode + "-" + stars;

        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + heroX);




    }
}

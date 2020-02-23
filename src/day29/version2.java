package day29;

public class version2 {
    public static void main(String[] args) {

        //String[] allHeroes =


        String hero1 = "Superman-Clark J Kent";

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

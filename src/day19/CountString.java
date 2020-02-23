package day19;

public class CountString {

    public static void main(String[] args) {

        String name = "Esra Fidan";



        //System.out.println( name.charAt(0)=='a');

        int countOfA=0;

        for (int x = 0; x <name.length() ; x++) {

            System.out.println(name.charAt(x));

            if(name.charAt(x)=='a'){
                //System.out.println("BINGO FOUND IT!");
                ++countOfA;
            }

        }

        System.out.println("countOfA= " + countOfA);

    }
}

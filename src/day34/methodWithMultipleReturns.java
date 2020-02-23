package day34;


import java.util.Arrays;

public class methodWithMultipleReturns {
    public static void main(String[] args) {

        String sentence = "I Love Java";
        char[] eachChars= sentence.toCharArray();
        String[] eachWords = sentence.split(" ");

        int[] resultArr= returnBoysVSGirls();
        System.out.println(Arrays.toString(resultArr));
    }

    public static int[] returnBoysVSGirls(){
        int[] boysGirlsCount={57,57};
        return boysGirlsCount;

    }

}

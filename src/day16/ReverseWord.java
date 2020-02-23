package day16;

public class ReverseWord {

    public static void main(String[] args) {

        String word1 = "Java";
        String word2 = "";

        //word2 = word1.charAt(3)+" "+word1.charAt(2)+" "+word1.charAt(1)+" "+word1.charAt(0);
        word2 += word1.charAt(3) +""+ word1.charAt(2) + word1.charAt(1)+ word1.charAt(0);

        System.out.println("word2=" + word2);

        String msg ="Hello";
               msg += " World!";
        System.out.println("msg= "+ msg);






    }
}

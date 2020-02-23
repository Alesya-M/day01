package offficeHour;

public class Muhtar_01_2 {
    public static void main(String[] args) {

        System.out.println(frequencyOfChars("AABBCCC"));
        System.out.println(RemoveDup("GGTTRREEESSMNN"));
        System.out.println(frequency("GHJKKSSSHHH",'S'));



        //REMOVE ALL DUPLICATES AND STORE THEM IN NEW STRING

        String str = "AAABBBCCCDDDEEE";
        String result1 = ""; //store non-duplicate

        for (int i = 0; i < str.length(); i++) {
//            if(!result1.contains(str.substring(i, i+1))) {
//                result1 += str.substring(i, i + 1);
//            }

            if (!result1.contains("" + str.charAt(i))) {
                result1 += "" + str.charAt(i);
            }
        }

        System.out.println(result1);//ABCDE
    }

    public static String RemoveDup(String str) {
        String result1 = "";
        for (int i = 0; i < str.length(); i++) {
//
            if (!result1.contains("" + str.charAt(i))) {
                result1 += "" + str.charAt(i);
            }
        }
        return result1;
    }


    //TASK 2: Frequency("AAABBBBB", 'B') ==>  6
    public static int frequency(String str, char ch) {

        int count = 0;//count how many time the char is occured in str
        char[] arr = str.toCharArray();
        for (char each : arr) {

            if(each== ch){
               count+=1;
            }
        }
        return count;
    }
    
    
    //TASK 3 : Frequency of each Character("AABCC") - A-2 B-1 C-2
    public static String frequencyOfChars(String str){ //"AAABBBCCC"

      String result ="";
      String nonDup = RemoveDup(str); //ABC

        for (int i = 0; i <nonDup.length() ; i++) {
            int count = frequency(str, nonDup.charAt(i));
           result += ""+nonDup.charAt(i)+ count;
        }
        return result;

    }
}

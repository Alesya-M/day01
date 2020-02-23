package day36;

public class methodPractice {
    public static void main(String[] args) {
        System.out.println(checkIfStringHasNumber("hghg77ghgh"));
    }

    //write a method to accept a String and return Boolean. It should return TRUE is
    //the String contains at least one number

    /**
     *
     * @param str
     * @return true if the String contains at least one number
     */


    public static Boolean checkIfStringHasNumber (String str){
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if(Character.isDigit(eachChar)){
                return Boolean.valueOf(true);
            }


        }
        return Boolean.valueOf(false);
    }
}

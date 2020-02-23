package day33;

public class warmUp {
    public static void main(String[] args) {

        System.out.println(getSpelledName("Alesya"));
    }

    public static String getSpelledName(String name){


        String result="";

        for (int i = 0; i < name.length(); i++) {
            result = result+name.charAt(i);

            if (i != name.length() - 1) {
                result=result+ "-";
            }

        }

        return  result; //return result.substring(0,result.length()-1);

    }
}



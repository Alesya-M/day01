package myOwnPractice;

public class day34_Muhtar_Constructors {

    public static void main(String[] args) {

        String letters = "ghghhghgfjfjfjfj";
        System.out.println(RemoveDupl(letters));

        System.out.println(count("GHHFFH", "H"));
    }

    public static String RemoveDupl(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(!result.contains(str.substring(i, i+1))){
                result += str.substring(i,i+1);
            }
        }

        return result;

    }

    public static int count(String a, String b){

        int count = 0;


        while( a.contains(b)){
            count++;
            a= a.replaceFirst(b,"");
        }
        return count;
    }
}

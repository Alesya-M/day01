package day35;

public class characterPractice {
    public static void main(String[] args) {

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('6'));

        String str= "A34B123C4X";
        //Get the number out of this String
        //and store it into Integer variable x;
        String numsInStr="";

        for (int i = 0; i < str.length(); i++) {
            if(  Character.isDigit(str.charAt(i))){
                System.out.println("str.charAt("+i+")= "+str.charAt(i));
                numsInStr+= str.charAt(i);
            }
    }
        System.out.println("numsInStr = "+ numsInStr);
        Integer num =Integer.valueOf(numsInStr);
        System.out.println("num = "+num);
    }
}

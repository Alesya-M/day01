package myOwnPractice;

public class Practice {
    public static void main (String args[])
    {

        String name1="a";
        String name2=name1;
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));

        if ("Aaa"=="Aaa"){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }


}

package day06;

public class compoundOperator2 {

    public static void main(String[] args) {

        //+=, -=, *=, /=, %=
        // can simplify the operation if you have
        //same variable on both side of assignment

        int studentOnline = 263 ;
        //studentOnline = studentOnline + 5 ;
        studentOnline+= 5;
        System.out.println("5 people joined the class: " + studentOnline);

        //studentOnline = studentOnline - 3 ;
        studentOnline-= 3 ;
        System.out.println("3 people left the class " + studentOnline);

       // studentOnline = studentOnline * 2 ;
        studentOnline*= 2;
        System.out.println(studentOnline);

       // studentOnline = studentOnline / 3;
        studentOnline /= 3 ;
        System.out.println(studentOnline);
       // System.out.println(studentOnline);
    }
}

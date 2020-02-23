package day07;

public class CastingTheCharacter {

    public static void main(String[] args) {

        char grade = 'B' ; //Need to have single quote!
        int letterInNumber = 'B'; //B is represented by 66 in ascii table
                                  //here type char is automatically widened to int
                                  //and stored as number
        System.out.println(letterInNumber);

        int letterInNumber2 = 'b';
        System.out.println(letterInNumber2);

        char myFirstChar = (char) 100 ;
        System.out.println(myFirstChar);

        int A = 'A';
        int l = 'l';
        int e = 'e';
        int s = 's';
        int y = 'y';
        int a = 'a';
        System.out.println(A);
        System.out.println(l);
        System.out.println(e);
        System.out.println(s);
        System.out.println(y);
        System.out.println(a);

        char letterA ='a' ;

        System.out.println( letterA + 1 );
        System.out.println( " " + letterA + 1 );
        System.out.println( " " + (letterA + 1) );

    }
}

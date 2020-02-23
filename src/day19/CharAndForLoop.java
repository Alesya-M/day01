package day19;

public class CharAndForLoop {

    public static void main(String[] args) {

        //each character has its corresponding ascii value
        //from ascii table
        //System.out.println(x);

       // int x = 'A';
        char myChar = 'A';

        System.out.println(myChar);
        //'A' + 1 --->> 65 + 1 = 66--->> 'B'
        System.out.println(   ++myChar  );
        //'B' + 1 --->> 66 + 1 = 67--->> 'C'
        System.out.println(   ++myChar  );
        //'C' + 1 --->> 67 + 1 = 68--->> 'D'
        System.out.println(   ++myChar  );
        //'D' + 1 --->> 68 + 1 = 69--->> 'E'
        System.out.println(   ++myChar  );


        System.out.println('A'>'B');
        System.out.println('Z'>'B');


        for (char iChar = 'A' ; iChar<='Z'; iChar++){

            System.out.print(iChar  + " ");

        }

        System.out.println();

        for( char kChar = 'Z'; kChar>='A'; kChar--){

            System.out.println(kChar + " ");
        }

        //Homework




    }
}

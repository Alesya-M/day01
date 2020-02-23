package day34;

public class ReturnPractice {
    public static void main(String[] args) {

        //return is used for returning the value or as a break;
        //break VS return;
        //BREAK--->> loop: break out of the loop
        //     --->> switch: break out of the case;
        //     --->> can we use it to exit method? NO!!!!

        //RETURN--->> inside a method
        //           return the value out of a method with return type
        //           the moment the return keyword is reached it will terminate the method
        //           Can it be used in void method?
        //           YES BUT ONLY IN THIS WAY: RETURN;
        //           what is the benefit of using in void method?
        //           to terminate the method early

        printMin4CharacterLenthName("Jon");
        printMin4CharacterLenthName("Alesya");

    }

    public static void printMin4CharacterLenthName(String name){
        //if the name has less than 4 chars-->> get out of the method

        if(name.length()<4){
            System.out.println("INVALID NAME!");
            return;
        }
        System.out.println(name);
    }
}

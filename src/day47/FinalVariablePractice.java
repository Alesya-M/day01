package day47;

public class FinalVariablePractice {

    public static void main(String[] args) {

        int x = 10; //declaring and initializing a variable

        x = 100;   //re-assigning new value to the variable
                   // stroring/giving new value to the variable
                  // changing the original value of the variable

        final int a = 20;
        //re-assigning new value to the FINAL variable---WILL GIVE AN ERROR!!!
        // a = 200;

        final Student s1 = new Student(101);
        System.out.println(s1.studentID);
        //s1.studentID = 201;
        System.out.println(s1.studentID);


        System.out.println(Student.SCHOOL);

        System.out.println(Byte.MAX_VALUE);
        printDoubledNumber(12);

    }

    public static void printDoubledNumber(final int x){
        //Not x = x*2 ---> CANNOT reassign the final value
        System.out.println("x*2= "+x*2);
    }
}

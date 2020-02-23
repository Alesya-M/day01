package day23;

public class forEachLoopPractice {

    public static void main(String[] args) {

        //create a  long array or 5 items called salaries
        //put your salary amounts that ok for your offer
        //use for each loop to iterate over them
        //
        //OPTIONALLY:
        //print only salary more than 100000
        //

        long[] salaries = new long[]{89000L, 125000L, 100000L, 150000L, 200000L};

        for(long salary: salaries){

            //System.out.println("Each Salary = " + salary);

           // if (salary>100000){
               // System.out.println("This is my salary : "+ salary);
           // }

        }
        for (long salary : salaries) {

//            if (salary>100000){
//                System.out.println("Salary : "+ salary);
//            }
            if(salary<=100000){
                continue;

            }
            System.out.println("salary = " + salary);

        }


    }
}

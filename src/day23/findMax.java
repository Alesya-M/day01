package day23;

public class findMax {

    public static void main(String[] args) {

        long[] salaries = new long[]{100000L, 200000L, 150000L, 115000L, 60000L};
        //THE LOGIC OF FINDING MAX NUMBER
        //WRITE DOWN THE FIRST NUMBER AND COMPARE THE NUMBER
        //IF THE NUMBER IS SMALLER THEN THE NEXT ONE REPLACE IT WITH A BIGGER ONE
        //DO IT UNTIL YOU DON'T HAVE ANY NUMBERS LEFT

        long maxSalary = salaries[0];

        for (long salary : salaries) {

            if(salary > maxSalary){
                maxSalary= salary ;
            }


        }
        System.out.println("maxSalary = " + maxSalary);



    }
}

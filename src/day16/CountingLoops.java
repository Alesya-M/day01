package day16;

public class CountingLoops {

    public static void main(String[] args) {

        int counter = 1 ;

        while ( counter <= 10){
            System.out.println(counter++);
        }


        System.out.println("-------Different way-------");



        int cnt = 0;
        while (cnt++ <10){

            System.out.println(cnt);
        }



    }

}

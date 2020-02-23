package day22;

public class LinkGenerator {

    public static void main(String[] args) {

       // https://learn.cybertekschool.com/courses/278/modules#3317

        //Day 21 to day 56

        String link = "https://learn.cybertekschool.com/courses/278/modules#";
        //int num = 3317;
        String dayMsg = "This will lead you to ";


        for (int day =21 ; day <=56 ; day++) {

            System.out.println( dayMsg +day);
            System.out.println(link+ (3317-21+day));
            //num=num+1;

        }



    }
}

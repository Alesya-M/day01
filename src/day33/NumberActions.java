package day33;

public class NumberActions {
    public static void main(String[] args) {
        System.out.println(getSumFrom1ToX(6));
        System.out.println(build_GOT_Email("Alesya", "Malysheva"));

        String fullName = "Susan cure";

        // String part1 = fullName.split(" ")[0] ;
        // String part2 = fullName.split(" ")[1] ;
        // String herEmail = build_GOT_Email(part1,part2);


//        String fullName = "Susan Cure";
//        int space = fullName.indexOf(" ");
//        String firstName = fullName.substring(0,space);
//        String lastName = fullName.substring(space+1);
//        System.out.println(emailBuilder(firstName,lastName));

        String[] fullNameSplit= fullName.split(" ");
        String herEmail = build_GOT_Email(fullNameSplit[0],fullNameSplit[1]);
        System.out.println("herEmail = "+ herEmail);


    }

    static public int getSumFrom1ToX(int num){
        int sum=0;
        for (int i = 0; i <= num; i++) {
            sum=sum+i;
        }
        //TO DO: You code goes here
        return sum;
    }



    static public String build_GOT_Email(String firstName,String lastName){
        String email= firstName.charAt(0)+lastName+"@NightWatch.com";

        return email;
    }
}

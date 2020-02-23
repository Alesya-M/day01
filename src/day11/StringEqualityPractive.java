package day11;

public class StringEqualityPractive {

    public static void main(String[] args) {

        //Checking String Equality should be always done by using equals method of the String

        //oneString.equals(anotherString) -->> TRUE or FALSE

        //System.out.println("Java".equals("java"));
        System.out.println("Java".equals("Java"));

        String myStr = "Java";
        System.out.println( myStr.equals("Java")   );

        String yourStr = new String("Java");
        System.out.println( "is my string same as your string?" );
        System.out.println( myStr.equals(yourStr) );

        if(myStr.equals ("Java")) {

            System.out.println("Correct Word!");
        }else {
            System.out.println("Say JAVA!");
        }

    }
}

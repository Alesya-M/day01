package day16;

public class IndexOfWith2Parameters {

    public static void main(String[] args) {

        //             012345678901234567890123456789012
        String name = "I love Java I Love Java Java Java ";

        System.out.println( "Java starting from 0 "+ name.indexOf("Java"));
        System.out.println("Java starting from 7 "+name.indexOf("Java",7));
        System.out.println("Java starting from 8 "+name.indexOf("Java",8));
        System.out.println("Java starting from 9 "+name.indexOf("Java",9));
        System.out.println("Java starting from 19 "+name.indexOf("Java",19));
        System.out.println("Java starting from 20 "+name.indexOf("Java",20));


      int firstJavaLocation = name.indexOf("Java"); //location of first java/
      int startingPointToSearchSecondJava = firstJavaLocation + 1; //OR +word.length IF YOU DONT KNOW THE LENGTH OF THE WORD
      int secondJava = name.indexOf("Java", startingPointToSearchSecondJava);

      int thirdJava = name.indexOf("Java", secondJava+1);

        System.out.println("secondJava = " + secondJava);
        System.out.println("third Java =" + thirdJava);

        int firstSpaceLocation = name.indexOf(" ");
        int secondSpace = name.indexOf(" ", firstSpaceLocation + 1);

        System.out.println("Second word in this sentence is " + name.substring(firstSpaceLocation+1, secondSpace ));




        //get the second java from the sentence
        //assume you already know there is 4 java in this sentence
        //second java means -->> the Java showed up after first Java showed up

        //first find out where is location of the first Java showed up
        //in order to find second one,
        //instead of searching from the beginning
        //search from right after the location you found first java
        //then it will give give you the index of second java

        //BUT HOW DO I START FROM DIFFERENT LOCATION WHEN USING INDEXOF
        //BECAUSE INDEX ALWAYS START FROM BEGINNNG

        // indexOf method has 2 version 1 expect 1 internal data///


    }
}

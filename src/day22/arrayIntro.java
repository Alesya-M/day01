package day22;

public class arrayIntro {

    public static void main(String[] args) {

        int num1 = 10 ;

        //syntax for creating variable to store multiple items
        //and assigning values
        //dataType [] variableName = new dataType[ count of item ] ;
        //This array can hold 4 items, it is also known as array size

        int [] score = new  int[4] ; //Stores 4 items!
                                    // Array size

        //assigning value to each index
        score [0] = 95 ;
        score [1] = 70 ;
        score [2] = 88 ;
        score [3] = 100 ;

        //accessing the elements inside array one by one
        System.out.println( score[0]   );
        System.out.println( score[1]   );
        System.out.println( score[2]   );
        System.out.println( score[3]   );

        //updating the value at certain index
        score[1]= 99;
        System.out.println(score[1]);

        //once array is created with certain size, we CANNOT CHANGE THE SIZE!
        //When you create new Array Object
        //it will get default value element
        System.out.println();
        System.out.println("Next task- empty variables:");
        int [] numbers = new int[3] ;
        System.out.println( numbers[0]);
        System.out.println( numbers[1]);
        System.out.println( numbers[2]);

        //create an byte array with size 4
        //and store it into a variable called data
        //assign value for each index location
        //print out the values at each index
        //update last index value
        //then print it out
        System.out.println();
        System.out.println("Byte Array");
        byte [] data = new byte[4];
        data [0] = 3;
        data [1] = 12;
        data [2] = 44;
        data [3] = 87;

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        System.out.println();
        System.out.println("Updating the array: ");

        data [3] = 87;
        System.out.println("new value of data[3] is : " + data[3]);











    }

}

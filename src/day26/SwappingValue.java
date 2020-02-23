package day26;

import day16.CountTo10;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class SwappingValue {

    public static void main(String[] args) {

        String name1 = "Emma";
        String name2 = "Jason";

        //name1=name2;
        //name2=name1;

        String tempContainer = name1; // Emma
        name1=name2; //name1----> Jason
        name2 = tempContainer;//name---->Emma

        //swap the value of first item and last item
        int[] myNumbers2 = new int[]{10,40,30,7};

        int temp = myNumbers2[0];//temp has 10
        myNumbers2[0] = myNumbers2[3] ;// first item value become 7
        myNumbers2[3]= temp;

        System.out.println("first item = "+ myNumbers2[0]);
        System.out.println("last item = " + myNumbers2[3]);

        System.out.println("myNumbers = "+ Arrays.toString(myNumbers2) );

        int temp2 = myNumbers2[1];
        myNumbers2[1] = myNumbers2[2];
        myNumbers2[2] = temp2;
        System.out.println("myNumbers = "+ Arrays.toString(myNumbers2));

    }
}

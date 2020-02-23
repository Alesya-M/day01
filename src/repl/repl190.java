package repl;

import java.util.Arrays;

public class repl190 {
    public static int[] mergR(int[] a,int[] b) {

        int[] ret= new int [a.length+b.length] ;
        int z= 0;
        for(int element : a){
            ret[z] = element;
            z++;
        }
        for(int element : b){
            ret[z] = element;
            z++;
        }

        return ret;

    }//end mergR

    public static void main(String[] args)
    {
        int[]h = {5,6,7};
        int[]y = {1,2,3,4};

        System.out.println(Arrays.toString(mergR(h,y)));
    }
}

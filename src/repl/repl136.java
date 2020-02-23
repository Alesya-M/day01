package repl;
import java.util.Scanner;
public class repl136 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {1,5,5,7,6,7};

        //TODO Type your code below:
        String num="";
        for (int i = 0; i < nums.length; i++) {

           num += (""+nums[i]);
        }
        for (int x = 0; x < num.length()-1; x++) {

            if(num.contains("55")){

                System.out.println("TRUE");
                break;

            }else {
                System.out.println("False");
                break;

            }

        }





    }
    
}

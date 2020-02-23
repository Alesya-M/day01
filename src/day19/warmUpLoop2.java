package day19;

public class warmUpLoop2 {
    public static void main(String[] args) {

        int start=55;
        int end=45;
        if(start<end) {
            System.out.println("INCREASING THE SPEED!");
            //increasing the speed till reach ending speed
            for (int i = start; i <= end; i++) {

                System.out.print(  i+ ", ");
            }

        }else if(start>end){
            System.out.println("DECREASING THE SPEED!");
            //decreasing the speed till reach ending speed
            for(int x = start; x>=end; x--){

                System.out.print( x + " ,");
            }

        }else {
            System.out.println("No action needed!");
        }

        





    }



}

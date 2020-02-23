package day22;

public class LoopArrayReversed {

    public static void main(String[] args) {

        int [] score = new  int[4] ;

        score [0] = 95 ;
        score [1] = 70 ;
        score [2] = 88 ;
        score [3] = 100 ;

        int itemCount = score.length ; //no parenthesis- it is a PROPERTY! --if there is parenthesis it is an action-it is METHOD!
        int lastItemIndex = itemCount -1 ;

        //for (int x = 0; x<= lastItemIndex; x++)
        //for (int x = 0; x<= itemCount -1; x++)
        for (int x = lastItemIndex ; x >= 0; x--) { //if x<=itemCount -1 //put -1 - Last index

            System.out.println("index location : " + x);
            System.out.println(score[x]);

        }



    }
}

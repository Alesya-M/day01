package day22;

public class arrayCreation {

    public static void main(String[] args) {
        //creating an array in second way
        
        int [] ages;
               ages = new int[]{3,5,11,33,57,18};
        
        int itemCount = ages.length ;
        System.out.println("itemCount = " + itemCount);

        for (int x = 0; x < itemCount; x++) {

            System.out.println(ages[x]);

        }
        System.out.println("Area Codes: ");
        int[] areaCodes = {412, 300, 444, 765 }; //This way only can be done in one line
        for (int x = 0; x < areaCodes.length; x++) {
            System.out.println(areaCodes[x]+ " ");

        }

        

    }
}

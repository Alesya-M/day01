package day26;


public class sptilPractice {

    public static void main(String[] args) {

        //2 additional String methods related to array
        // toCharArray(), another is split(bySomething)

        String survey = "Complete B15 Online 1 Month Survey";
        char[] surveyChars = survey.toCharArray();


        for ( char each : surveyChars ){
            System.out.println("Each char is : "+ each);
        }

        ///WHILE LOOP

        int x = 0;
        while ( x<surveyChars.length ){

            System.out.println(" each char is : " + surveyChars[x]);
            x++;
        }

        for (int i = 0; i < surveyChars.length; i++) {
            System.out.println(" each char is : " + surveyChars[i]);

        }

//        int y = 0 ;
//        do{
//
//            System.out.println("each char is : " + surveyChars[y]);
//        }while (y < surveyChars.length)

    }
}

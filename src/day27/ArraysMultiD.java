package day27;

public class ArraysMultiD {
    public static void main(String[] args) {


        String [] developersTeam ={"Kakashka","Vonuchka","Dermo"};
        String [] testersTeam = {"Dolbaeb","Suka","Dermoed","Shmara"};
        String [] businessAnalistsTeam ={"Lisa","Gena","Kolya"};

        String[][] scrumTeam = {developersTeam, testersTeam,businessAnalistsTeam};

        int maxLength = scrumTeam[0][0].length(); //Total characters of each string
        String longestString ="";

        for( String [] eachTeam: scrumTeam){
            for (String eachElement : eachTeam) {
                if(maxLength<eachElement.length()){
                    maxLength=eachElement.length();
                    longestString=eachElement;
                }
            }

        }

        System.out.println(maxLength);
        System.out.println(longestString);

        for(String[] each1DArray : scrumTeam){

            for(String eachElement : each1DArray){
                if(maxLength==eachElement.length()){
                    System.out.println(eachElement);
                }
            }
        }
    }
}

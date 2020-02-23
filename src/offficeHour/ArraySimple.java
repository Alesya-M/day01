package offficeHour;

public class ArraySimple {
    public static void main(String[] args) {

       String[]developers ={"Natasha","Alesya","Ulya","Kolya"};
       String[]testers ={"Vlad","Tanya","Ruslan","Temur"};
       String[]analTeam={"Dermo","Shitface","PoopyButt","Zanoza","Kakashka"};

       String[][] scrumTeam ={developers, testers, analTeam};

       int maxLength = scrumTeam[0][0].length();
       String longestString="";

       for(String[] each1DArray : scrumTeam   ){
           for(String eachelement: each1DArray){
               if(maxLength<eachelement.length()){
                   maxLength=eachelement.length();
                   longestString=eachelement;
               }
           }
       }

        System.out.println("Longest name is "+longestString+" it has "+maxLength+" letters.");

        for(String[] each1DArray : scrumTeam   ){
            for(String eachelement: each1DArray){
                if(maxLength==eachelement.length()){
                    System.out.println(eachelement);
                }
            }
        }
    }
}

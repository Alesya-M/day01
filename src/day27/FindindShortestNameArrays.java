package day27;

public class FindindShortestNameArrays {

    public static void main(String[] args) {

        String [] developersTeam ={"Kakashka","Vonuchka","Dermo"};
        String [] testersTeam = {"Dolbaeb","Suka","Dermoed","Shmara"};
        String [] businessAnalistsTeam ={"Lisa","Gena","Kolya"};

        String[][] scrumTeam = {developersTeam, testersTeam,businessAnalistsTeam};
        //Find the shortest string of text
        int minLength = scrumTeam[0][0].length();
        String shortestString = scrumTeam[0][0];

        for (int x = 0; x < scrumTeam.length; x++) {
            for (int i = 0; i < scrumTeam[x].length ; i++) {
                if(minLength>scrumTeam[x].length){
                    minLength=scrumTeam[x][i].length();
                    shortestString = scrumTeam[x][i];
                }

            }

        }
        System.out.println("Min LENGTH:- "+minLength);
        System.out.println("Shortest String:- "+ shortestString);

    }
}

package day43;

import day41.Movie;

import java.security.PublicKey;

public class MovieActions {

    public static void main(String[] args) {

        Movie m1 = new Movie("Joker",2.5,"Drama");
        Movie m2 = new Movie("Cinderella",1.5,"Family");

        printMovieInformation(m1);
       // printMovieInformation(m2);
        printMovieInformation(m2);

        printShorterDurationMovieName(m1,m2);

        //Integer i1 = Integer.valueOf(12);
        //Movie m1 = Movie.valueOf("Cinderella", 2.4,"Drama");

        //Create a static method to return Joker movie
        Movie result = getJokerMovieObject();




    }

    public static Movie getJokerMovieObject(){
        Movie j = new Movie("Joker",2.5,"Drama");
        return j;
    }



    public static void printMovieInformation(Movie movieObj){
        System.out.println("Name is "+movieObj.getName());
        System.out.println("Length is "+movieObj.getLength());
        System.out.println("Type is "+ movieObj.getType());
    }

    public static void printShorterDurationMovieName(Movie movieObj1, Movie movieObj2){
        //print shorter length movie
        if(movieObj1.getLength()<movieObj2.getLength()){
            System.out.println(movieObj1.getName());
        }else {
            System.out.println(movieObj2.getName());
        }
    }





}

package day43;

import day41.Movie;

public class MovieUtility {

    private String name;
    private double length;
    private String type;

    public static void main(String[] args) {
        Movie m1 = new Movie("Titanik",2.2,"Drama");
    }

    //write a constructor to set all the fields value

//    public Movie(){
//        System.out.println("EMPTY MOVIE");
//    }
//    //write a constructor to sett all the fields value


    public MovieUtility(String name, double length, String type) {
        this.name = name;
        this.length = length;
        this.type = type;
    }

    public static void printMovieInformation(Movie movieObj){
        System.out.println("Name is "+movieObj.getName());
        System.out.println("Length is "+movieObj.getLength());
        System.out.println("Type is "+ movieObj.getType());
    }



    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

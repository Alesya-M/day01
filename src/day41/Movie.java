package day41;

public class Movie {

    private String name;
    private double length;
    private String type;

    //write a constructor to set all the fields value

//    public Movie(){
//        System.out.println("EMPTY MOVIE");
//    }
//    //write a constructor to sett all the fields value


    public Movie(String name, double length, String type) {
        this.name = name;
        this.length = length;
        this.type = type;
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

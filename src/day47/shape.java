package day47;

public abstract class shape {
    String name;
    int area;

    public shape(String name){
        this.name=name;
    }

    public abstract void calculateArea();

    public abstract String toString();
}

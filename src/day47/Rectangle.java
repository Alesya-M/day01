package day47;

public class Rectangle extends shape {
    int height;
    int width;

    public Rectangle(int height, int width){
        super("Rectangle");
        this.height=height;
        this.width=width;
    }



    @Override
    public void calculateArea() {
     area= width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}

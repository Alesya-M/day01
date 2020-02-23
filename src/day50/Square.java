package day50;

public class Square extends Shape {

    int length;

    public Square(String name, int length){
        super(name); //reusing functionality of super class
        this.length = length ;
    }

    @Override
    public void calculateArea() {
        area = length * length;
    }

    @Override
    public void draw() {
        System.out.println("Draw 4 equal lines with length "+ length+" with color "+ COLOR);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}

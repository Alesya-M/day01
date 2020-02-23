package offficeHour;
class circle{

    public double radius;
    public circle(double radius){
        this.radius=radius;
    }

    @Override
    public boolean equals(Object O){
        circle c = (circle)O;
        if(O instanceof circle)
            if(radius==((circle)O).radius)
            return true;
            /*
             Circle otherCircle= (Circle) obj;
             return this.radius== otherCircle.radius;
             */
        return false;
    }

}
public class TestCircle {
    public static void main(String[] args) {

        circle c1 = new circle(3.5);
        circle c2 = new circle(3.0);
        System.out.println(c1.equals(c2));

        circle c4 = new circle(7);
        circle c5 = new circle(7);
    }


}

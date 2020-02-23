package offficeHour;
class rectangle{
    public double l,w;


    public rectangle(double l,double w){
        this.l=l;
        this.w=w;
    }

    public boolean equals(Object O){

        if (O instanceof rectangle){
            double Area1 = l*w;
            double Area2 = ((rectangle) O).l*((rectangle) O).w;
            if(Area1==Area2){
                return true;
            }
        }

        return false;

    }

}

public class rectangleTest {

    public static void main(String[] args) {

        rectangle r1 = new rectangle(3,4);
        rectangle r2 = new rectangle(4,3);

        System.out.println(r1.equals(r2));

    }
}

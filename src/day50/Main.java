package day50;

public class Main {
    public static void main(String[] args) {

        Square s1 = new Square("square", 10);
        System.out.println("s1 without calculating area = "+ s1);
        System.out.println("s1 with area calculation = "+ s1);


        System.out.println("---------MATH----------");
        
        Addition q1 = new Addition(10,90);
        System.out.println( "q1 : " + q1);
        q1.calculate();
        System.out.println("q1 : " + q1);

        Substraction q2= new Substraction(90,10);
        System.out.println("q2 = " + q2);
        q2.calculate();
        System.out.println("q2 = " + q2);


        Substraction q3= new Substraction(10,90);
        System.out.println("q3 = " + q3);
        q3.calculate();
        System.out.println("q3 = " + q3);


    }
}

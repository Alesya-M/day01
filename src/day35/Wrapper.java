package day35;

public class Wrapper {

    public static void main(String[] args) {

        int x = 10;
        //primitive dara type is primitive value has no attribute or behaviour
        //each primitive type has wrapper class that turn it into object so we can treat is as an object

        Integer x1= new Integer(12); // This is an old way of creating Integer object
        Integer x2 = Integer.valueOf(10);
        Integer x3 = Integer.valueOf("10");

        byte bValue = x2.byteValue();
        System.out.println("byte Value= "+ bValue);
        
        double dValue = x2.doubleValue();
        System.out.println("dValue = " + dValue);


    }
}

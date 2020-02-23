package offficeHour;

class TestData{

    public TestData(){
        System.out.println("A");
    }
    int a = 100;
    public void method1(){
        System.out.println("super class instance method");
    }
}

public class SuperKeyword extends TestData{

    public SuperKeyword(){
        super();
        System.out.println("B");
    }
    public void method1(){
        System.out.println("sub class instance method");
    }

    public static void main(String[] args) {

        SuperKeyword obj = new SuperKeyword();
        //obj.mm();

    }

    public void mm(){
        System.out.println(super.a); //calling instance variables from super class
        super.method1(); // calling the instance methods from the super class
    }
}

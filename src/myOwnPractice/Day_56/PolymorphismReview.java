package myOwnPractice.Day_56;


public class PolymorphismReview {

    public static void main(String[] args) {
        A obj = new A();
        A obj2= new B();
        obj2.methodA();

       // B obj2= new B();
        C obj5 = new D();
        E obj6 = new D();
        A obj11 = new B();
        obj11.methodA();
        obj11.methodC();



    }
}

abstract class C{

}

class D extends C implements E{

}

class  A extends C{
    protected void methodA(){
        System.out.println("Method A from A class");
    }

    public static void methodC(){
        System.out.println("Method C from A class");
    }

}

class B extends A {
    public void methodB(){
        System.out.println("Method B");
    }
    @Override
    public void methodA(){
        System.out.println("Method A from class B");
    }

    public static void methodC(int a){
        System.out.println("Method C from B class");
    }
}

interface E{

}

abstract class F implements E{

}


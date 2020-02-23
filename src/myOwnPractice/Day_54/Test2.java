package myOwnPractice.Day_54;

interface InterFace{
    abstract void get();
}

interface Interface2 extends InterFace{
    abstract void frame();
}

abstract class AbsClass{

}

public class Test2 extends AbsClass implements Interface2 {

    public static void main(String[] args) {

       InterFace obj = new Test2();
       obj.get();

       Interface2 obj2 = new Test2();
        obj2.frame();
        obj2.get();

       AbsClass obj3 = new Test2();



    }

    @Override
    public void get() {
        System.out.println("Chrome");
    }

    @Override
    public void frame() {
        System.out.println("Firefox");
    }
}

package myOwnPractice.Day_54;

import day49.Tesla;

public class  Test extends AbstractClass {
    public static void Test() {

    }


    public static void ByLinkText(int a) {
        System.out.println("Link Text sub");
    }

    @Override
    public void get(){
        System.out.println("Overriden method");
    }

    public static void main(String[] args) {

        Test.ByLinkText(5);
        AbstractClass obj2 = new Test();
        obj2.ByLinkText();
        obj2.get();

        Test obj3 = new Test();
        obj3.ByLinkText(10);

    }
}





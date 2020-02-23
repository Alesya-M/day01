package offficeHour.Static_Instance;

class Test{

    public Test(String str){

        System.out.println("Name is: "+str);
    }

    public void method(){
        int a = 100; //local variable
                     //can only be used in the same method,
                    // cannot be used outside of the method or block


    }
    public static void main(String[] args) {
        Practice.staticMethod();
        Practice obj = new Practice();
        obj.staticMethod(); //static is shared by all the object of the class.
                            // not the right way. Should be called static way: through the class name.
        if (true) {
            int b =100; //this variable is LOCAL and can be used only within this "if" block
        }

        Test obj1 = new Test("Alesya");


    }
}

public class Practice {

    public static void staticMethod(){
    System.out.println("This is static method");
}
}

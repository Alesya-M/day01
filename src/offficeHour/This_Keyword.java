package offficeHour;

public class This_Keyword {

    int a = 100;
    public  void method1(){
        System.out.println(this.a); //calling instance variable
    }

    public void method2(){
        this.method1(); //calling instance method
    }

}

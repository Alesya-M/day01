package day34;

public class overloadingPractice {
    public static void main(String[] args) {
        addMethod(5);
        addMethod(5,7);
        addMethod(444L,5322L);
        addMethod(44,66,22);

    }

    public static void addMethod(int num){
        System.out.println(num+100);
    }

    public static void addMethod(int num, int num2){
        System.out.println(num+num2);
    }

    public static void addMethod(int num, int num2, int num3){
        System.out.println(num+num2+num3);
    }

    public static void addMethod(long num1, long num2){
        System.out.println(num1+num2);
    }
}

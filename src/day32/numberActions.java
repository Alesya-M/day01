package day32;

public class numberActions {
    public static void main(String[] args) {
        countDown50EvenNumbersto0();
        countDownByEvenNumbers(10,1);
    }
    public static void countDown50EvenNumbersto0(){
        for (int i = 50; i >=0; i--) {
            if(i%2==0){
                System.out.print(i+ " ");
            }

        }
        System.out.println();
    }

    public static void countDownByEvenNumbers(int x, int y){

        for (int i = x; i >=y ; i--) {
            if(i%2==0){
                System.out.print(i+ " ");
            }

        }
        System.out.println();
    }
}

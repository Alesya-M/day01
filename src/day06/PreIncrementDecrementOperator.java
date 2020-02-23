package day06;

public class PreIncrementDecrementOperator {

    public static void main(String[] args) {

        int offerCount = 2;
        //offerCount = offerCount + 1 ;
        //offerCount +=1 ;
        ++offerCount;
        System.out.println("Offer Now " + offerCount);

        --offerCount;
        System.out.println("Offer Now after decreasing by one is " + offerCount);
    }
}

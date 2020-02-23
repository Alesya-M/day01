package day54;

public class Utility {

    public static void main(String[] args) {

        Wearable w1 = new Clothes();
        werMyWearable(w1);

        Wearable w2 = new MakeUp();
        werMyWearable(w2);

        Wearable w3 = new Watch();
        werMyWearable(w3);

        Wearable w4 = new Parfume();
        werMyWearable(w4);

        werMyWearable( new Watch() );

        System.out.println("\n----calling the getMyWearableObject---\n");
        Wearable result = getMyWearableObject();
        System.out.println("result = " + result);
        System.out.println(result.getClass().getSimpleName());

    }

    //made it static so we can just call it directly
    public static void werMyWearable(Wearable any){

        any.wear();
    }

    public static Wearable getMyWearableObject(){
        Wearable w2 = new Clothes();
        return w2;
    }
}

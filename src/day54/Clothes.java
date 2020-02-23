package day54;

public class Clothes implements Wearable {

    int size;


    public static void main(String[] args) {

        Clothes c1 = new Clothes();
        Wearable w1 = new Clothes();
        Object o1 = new Clothes();

        Watch wa = new Watch();
        Wearable w2 = new Watch();
        Object o2 = new Watch();

        Parfume p1 = new Parfume();
        Wearable w3 = new Parfume();
        Cosmetic c2 = new Parfume();
        Object o3 = new Parfume();

        MakeUp m1= new MakeUp();
        Wearable m2= new MakeUp();
        Cosmetic m3= new MakeUp();
        Object o4= new MakeUp();
    }

    @Override
    public void wear() {
        System.out.println("Wearing Clothes!");
    }
}


class Watch implements Wearable{

    @Override
    public void wear() {
        System.out.println("Wearing watch");
    }
}

class Parfume implements Wearable, Cosmetic{

    @Override
    public void wear() {
        System.out.println("Wearing Parfume");
    }
}

class MakeUp implements Wearable,Cosmetic{

    @Override
    public void wear() {
        System.out.println("Wearing make up");
    }
}


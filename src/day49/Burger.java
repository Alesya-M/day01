package day49;

public class Burger implements Edible, Juicy {

//    public Burger(){
//        super();
//    }

    @Override
    public void eat() {
        System.out.println("Eat burger");
    }

    @Override
    public void drink() {
        System.out.println("Eat burger then drink soda");
    }

    @Override
    public void melt() {

    }
}

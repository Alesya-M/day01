package day49;

public class IceCream extends Object implements Edible{

    @Override
    public void eat() {
        System.out.println("Eat ice cream with spoon");
    }

    @Override
    public void drink() {
        System.out.println("Milkshake!");
    }

    public void digest(){
        System.out.println("Digesting food!");
    }

    public static void main(String[] args) {

        IceCream i1 = new IceCream();
        i1.drink();
        i1.eat();
        System.out.println(i1.toString());
//        Object o1 = new Object();
        i1.digest();

    }
}

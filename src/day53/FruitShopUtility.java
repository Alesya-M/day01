package day53;

public class FruitShopUtility {

    public static void main(String[] args) {

        Fruit f1 = new Apple("crispy","red","Gala");
        Fruit f2 = new Orange("sour","orange",12);
        displayFruit(f1);
        displayFruit(f2);
    }

    public static void  displayFruit(Fruit anyFruit){
        System.out.println("Displaying fruit\n" + anyFruit.toString());
    }
}

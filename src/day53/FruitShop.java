package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitShop {

    public static void main(String[] args) {

        Apple a1 = new Apple("sweet","red","Fuji");
        System.out.println("a1.taste = " + a1.taste);
        System.out.println("a1.type = " + a1.type);
        System.out.println("a1.color = " + a1.color);
        a1.getDigested();

        System.out.println("========================");

        Fruit f1=a1;
     
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);

        //Fruit f1=a1;
        System.out.println(f1.toString());


      

        Fruit f2 = new Apple("crispy","hot red","Gala");
        Fruit f3 = new Orange("sour","orange",12);
        Fruit f4 = new Orange("very sweet","Blood red",10);
        System.out.println("========================");

        Fruit [] muFruits = {f1,f2,f3,f4};
        for(Fruit each : muFruits){

            each.getDigested();
        }
        //in this way, its not resizable
        //List<Fruit>fruitList= Arrays.asList(f1,f2,f3,f4);

        //this is just a regular list with 3 items pre-filled
        System.out.println("========================");
        List<Fruit>fruitList= new ArrayList<>(Arrays.asList(f1,f2,f3,f4));

        for(Fruit each: fruitList){
            System.out.println(each.toString());
            System.out.println(each.getClass().getSimpleName());
        }


    }
}

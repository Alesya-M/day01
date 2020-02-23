package day60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionIntro {

    public static void main(String[] args) {

        //List interface extends Collection interface
        //and ArrayList implements List interface

        Collection<String> names= new ArrayList<>();
        names.add("Alesya");
        names.add("Hasan");
        names.add("Sevim");
        names.add("Abdullo");
        names.add("Tuana");
        names.add("Daria");


        names.addAll(names);//add all method- parameter type is Collection so we pass anything IS-A Collection
//       names.remove("Hasan");
        System.out.println("names = " + names);
        
        names.removeAll(Arrays.asList("Hasan"));

        Collection<String>toRemove = Arrays.asList("Daria");
        names.removeAll(toRemove);

        System.out.println("names = " + names);

//        for(String eachName : names){
//            System.out.println("eachName = " + eachName);
//        }
//
        names.forEach(each -> System.out.println("each = " + each));
        

        //System.out.println("first item "+names.get(0));

    }

}

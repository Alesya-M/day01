package day43;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
        
        Coffee c1 = new Coffee();
        System.out.println("c1 = " + c1);

        //Any non=primitive type can be assigned to null
        List<String> lst = new ArrayList<>();
        lst.add("abc");
        lst.add(null);
        String str= null;
        Scanner scan = null;
        Coffee cx = null;

        Coffee c2 = new Coffee();
        c2.setType("Turkish");
        c2.setCaffeineLevel(3);
        c2.setPrice(0);
        System.out.println(c2);

        Coffee c3 = new Coffee("Blonde",5,0);



        
        
    }
}

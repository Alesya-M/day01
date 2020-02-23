package day61;

import java.util.LinkedList;
import java.util.List;

public class List_LinkedListImplementation {
    public static void main(String[] args) {

        List<String>lst= new LinkedList<>();
        lst.add("Alesya");
        lst.add("Kolya");
        lst.add("Ruslan");
        lst.add("Temur");
        System.out.println("lst = " + lst);
        
        lst.remove("Ruslan");
        System.out.println("lst = " + lst);
    }
}

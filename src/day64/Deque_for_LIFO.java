package day64;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_for_LIFO {

    public static void main(String[] args) {
        Deque<String>lifoQue = new LinkedList<>();
        lifoQue.add("review the class");
        lifoQue.add("Drink tea");
        lifoQue.add("Watch TV");
        lifoQue.add("Sleep on couch");

        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        

    }
}

package day62;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet2 {
    public static void main(String[] args) {
        SortedSet<Integer> myNums2 = new TreeSet<>();
        myNums2.add(10);
        myNums2.add(10);
        myNums2.add(3);
        myNums2.add(10);
        myNums2.add(17);
        myNums2.add(30);
        myNums2.add(33);
        System.out.println("myNums2 = " + myNums2);
        System.out.println("myNums2.first() = " + myNums2.first());
        System.out.println("myNums2.last() = " + myNums2.last());
    }

}

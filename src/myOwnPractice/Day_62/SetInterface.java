package myOwnPractice.Day_62;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {

        SortedSet<String>treeset= new TreeSet<>();
        treeset.add("Alesya");
        treeset.add("Carolina");
        treeset.add("Brian");
        treeset.add("David");
        System.out.println("treeset = " + treeset);
        //task: remove duplicates from ArrayList, and sorted
        List<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,10,10));
        Collections.sort(list);
        System.out.println("list = " + list);
        
        List<Integer>list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10,9,8,7,6));
        TreeSet<Integer>ts = new TreeSet<>(list2);
        System.out.println("ts = " + ts);
        
        String str = "ZZZYYXXAAAABBBCCCDDDD";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        //TreeSet<String>restroom = new TreeSet<>(Arrays.asList(arr));
        LinkedHashSet<String>restroom = new LinkedHashSet<>(Arrays.asList(arr));
        String result = restroom.toString().replace("[","").replace("]","").replace(" ","").replace(",","");
        System.out.println(result);
        
        //second solution
        String str2 = new LinkedHashSet<String>(Arrays.asList(arr)).toString();
        System.out.println("str2 = " + str2);
        

                
        
    }
}

package offficeHour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Muhtar_arrayList {
    public static void main(String[] args) {

        //ArrayList methods:
        //add
        //size
        //get
        //clear
        //set

        List<Integer> list = new ArrayList <>();
        list.add(10); //autobox
        System.out.println(list.size());
        list.add(20); //autobox
        System.out.println(list.size());
        int num = list.get(1); //unboxing
        System.out.println(num);

        list.add(1,100);
        System.out.println(list);

        list.add(1,555);
        System.out.println(list);

        list.clear();
        System.out.println(list);
        System.out.println(list.size());


        List<String>list2= new ArrayList<>();
        list2.add("A");
        list2.set(0,"Alesya");
        System.out.println(list2);

        boolean result = list2.contains("A");
        System.out.println(result);
        System.out.println(list2.isEmpty());
        System.out.println(list2.indexOf("Alesya"));
        System.out.println(list2.indexOf("D")); //-1, the given object doesn't exist
        System.out.println(list2.remove("Alesya"));

        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        //int a = 1;
        Integer a1 = 1;

        boolean r1 = list3.remove(a1); //
        System.out.println(r1); //true, because 1 was removed from the ArrayList

        List<String> list4 = new ArrayList<>();
        list4.add("A");
        list4.add("B");
        list4.add("C");
        list4.add("D");

        //[A, B, C, D]

        list4.remove(2);//[A, B, D]
        System.out.println(list4);
        list4.remove("B");
        System.out.println(list4);

        Integer [] nums = {1,2,3,4,5,6,7,8};
        List <Integer> list5 = Arrays.asList(nums);
        System.out.println(list5);

        String [] students = {"Nursultan", "Irina","Dilshat","Roksana"};
        List<String> names = new ArrayList<>();
        //Arrays.asList(students);
        names.addAll(Arrays.asList(students));
        System.out.println(names);


        List<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("Audi","BMW","Porsche","Tesla","Honda"));
        System.out.println(cars);
        cars.retainAll(Arrays.asList("BMW","Porsche","Audi","Tesla"));
        System.out.println(cars);


        /*
        give name list: Ahmet, John, Ahmet, Eric, Aaron

         */

        List <String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmet","John","Ahmet","Eric","Aaron","Ahmet"));
        System.out.println(employees);
        employees.removeAll(Arrays.asList("Ahmet"));
        System.out.println(employees);


        List <String> employees2 = new ArrayList<>();
        employees2.addAll(Arrays.asList("Ahmet","John","Ahmet","Eric","Aaron","Ahmet"));
        employees2.retainAll(Arrays.asList("Ahmet"));
        System.out.println(employees2);


        List <Integer> nums2 = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,2,1));
        System.out.println(nums2);
        Collections.sort(nums2);
        System.out.println(nums2);







    }
}

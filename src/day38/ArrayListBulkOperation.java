package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkOperation {
    public static void main(String[] args) {

        List<String> groceries = Arrays.asList("Eggs","Milk","Butter","Apple","Turkey","Salmon");
        System.out.println("groceries = " + groceries);

        ArrayList<String> newLst = new ArrayList<>(groceries);
        newLst.add("Coke");
        newLst.add("Sugar");

        System.out.println("newLst = " + newLst);

        List<String> newItemsToAdd = Arrays.asList("Pasta", "branzini", "asparagus","spinach");

        //Adding one list to another LIST

        newLst.addAll(newItemsToAdd); //addALL ADDS COLLECTION
        System.out.println("newLst = " + newLst);


    }
}

 
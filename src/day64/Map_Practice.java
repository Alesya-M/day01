package day64;

import java.util.*;

public class Map_Practice {
    public static void main(String[] args) {

        Map<String,List<String>>groupMap = new HashMap<>();
        groupMap.put("PowerOf4",Arrays.asList("AAA","AA1","AA2","AA3") );
        groupMap.put("BugHunter",Arrays.asList("B1","B2","B3","Gulzina") );
        groupMap.put("Achievers",Arrays.asList("C1","C2","C3","C4") );
        groupMap.put("BugBuster",Arrays.asList("D1","D2","D3","D4") );

        System.out.println("groupMap = " + groupMap);
        groupMap.forEach((groupCode,allMembers)-> System.out.println("groupCode = " + groupCode+" \n\t members: "+ allMembers));

        System.out.println(groupMap.get("Achievers").get(3));

        //Check if BugHunter has Gulzina
        //               //get method comes from MAP  //Contains method comes from list
        System.out.println(groupMap.get("BugHunter").contains("Gulzina"));
        
        groupMap.put("Justice League",new ArrayList<>(Arrays.asList("Super man","Batman","WonderWoman")));
        groupMap.get("Justice League").add("Flash");
        System.out.println("groupMap.get(\"Justice League\") = " + groupMap.get("Justice League"));



    }
}

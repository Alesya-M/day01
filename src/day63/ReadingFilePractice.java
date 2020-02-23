package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingFilePractice {

    public static void main(String[] args) throws IOException {

        List<String>allData = Files.readAllLines(Paths.get("C:\\Users\\Nikolai\\IdeaProjects\\day01\\src\\day63\\employeeData"));
        Map<Integer,String>idNamePair = new HashMap<>();
        //allData.forEach(eachLine-> System.out.println("eachLine "+ eachLine));

        for(String eachLine : allData){
            int id = Integer.parseInt(eachLine.split(",")[0]);
            String name = eachLine.split(",")[1];
          idNamePair.put(id,name);
        }

        System.out.println("idNamePair = " + idNamePair);
        System.out.println("idNamePair.get(20) = " + idNamePair.get(20));

//        String line = "1, Lilian";
//        int id = Integer.parseInt(line.split(",")[0]);
//        String name = line.split(",")[1];
//
//        Map<Integer,String>idNamePair = new HashMap<>();
//        idNamePair.put(id,name);
//        System.out.println("idNamePair = " + idNamePair);


    }
}

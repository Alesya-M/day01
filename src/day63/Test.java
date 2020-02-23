package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args)throws IOException {

        List<String>data = Files.readAllLines(Paths.get("C:\\Users\\Nikolai\\IdeaProjects\\day01\\src\\day63\\Numbers.txt"));
        Map<Integer, Integer>ts = new HashMap<>();
        
        for(String eachLine : data){
            
            int id1 = Integer.parseInt(eachLine.split(",")[0]);
            int id2 = Integer.parseInt(eachLine.split(",")[1]);
            ts.put(id1,id2);
        }

        System.out.println("ts = " + ts);
        System.out.println("ts.replace(1,5) = " + ts.replace(4,66,8));
        System.out.println(ts.put(99, ts.remove(1)));
        System.out.println("ts = " + ts);
    }
}

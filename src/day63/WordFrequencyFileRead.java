package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class WordFrequencyFileRead {
    public static void main(String[] args) {

        try {
            List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\Nikolai\\IdeaProjects\\day01\\src\\day63\\map.txt"));
            System.out.println("allLines = " + allLines);

            String allLinesAsString = allLines.toString();

            //Map<String,Integer>map
        }catch (IOException e){
            System.out.println("ERROOR!");
        }
    }
}

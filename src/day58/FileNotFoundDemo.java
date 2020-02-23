package day58;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileNotFoundDemo {
    public static void main(String[] args) throws Exception {

           System.out.println("Before try catch");
            Files.readAllLines(Paths.get("file.txt"));

        System.out.println("After try catch");

        /*
          try {
            Files.readAllLines(Paths.get("file.txt"));
        }catch (IOException e){
            System.out.println("Exception happened and caught!");
        }
         */
    }

}

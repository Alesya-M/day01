package day60;

import java.io.FileNotFoundException;

public class DangerZoneAgain {
    public static void main(String[] args)throws FileNotFoundException, InterruptedException {

        try {
            readMyFile();
        } catch (FileNotFoundException e) {
            System.out.println("Handling here! Just moving on!");
        }
        Thread.sleep(3000);
        System.out.println("The end");

    }

    public static void readMyFile() throws FileNotFoundException{
        System.out.println("Reading the file in my computer");
        throw new FileNotFoundException("Kaboom, file is not here");
    }
}

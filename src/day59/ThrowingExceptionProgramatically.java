package day59;

import java.io.IOException;

public class ThrowingExceptionProgramatically {
    public static void main(String[] args) throws IOException {

        String x = "abc";
        try {
            throw new IOException("just throwing this away");
        } catch (IOException e) {
            System.out.println("Exception caught");
        }
        // NullPointerException e2 = new NullPointerException("Back to earth");
        //System.out.println(e2.getMessage());
        //throw e2;

        //throw new IOException("just throwing this away");

    }



}

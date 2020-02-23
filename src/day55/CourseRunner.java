package day55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRunner {

    public static void main(String[] args) {
        
        List<String> lst= new ArrayList<>
                      (Arrays.asList("Alesya","Gena","Aikokul","Zehra","Hasan"));
        
        Course java = new Course("Java",lst);
        System.out.println("java = " + java);
        java.studentNames.add("Alena");
        java.studentNames.add("Mohammed");
        java.studentNames.add("Ayse");

        System.out.println("java.studentNames = " + java.studentNames);
        System.out.println("my original lst = "+ lst);
        java.addStudent("Nikolay");
        java.addManyStudents(Arrays.asList("Kolya","Nick","Kolechka"));
        System.out.println(java.studentNames);
    }
}

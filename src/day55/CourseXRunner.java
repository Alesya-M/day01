package day55;

import java.util.ArrayList;
import java.util.List;

public class CourseXRunner {

    public static void main(String[] args) {

        List<Student>myLst=new ArrayList<>();
        myLst.add(new Student("Muge",44));
        myLst.add(new Student("Nikolay",4444));
        myLst.add(new Student("Alesya",6445));
        myLst.add(new Student("Gena",454));
        myLst.add(new Student("Akbar",123));
        
        CourseX java = new CourseX("Has-A",myLst);
        System.out.println("java = " + java);
        
    }
}

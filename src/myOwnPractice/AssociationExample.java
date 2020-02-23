package myOwnPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    String studentName;
    public Student(String studentName){
        this.studentName=studentName;

    }

    public String toString(){
        return studentName;
    }
}

class School{
    String schoolName;
    List<Student> AllStudentsList;

    public School(String schoolName,List<Student> AllStudentsList ){
        this.schoolName=schoolName;
        this.AllStudentsList=AllStudentsList;
    }

    public void AddNewStudent(Student student){

     this.AllStudentsList.add(student);
    }

    public void AddNewStudent(Student[]students){
        this.AllStudentsList.addAll(Arrays.asList(students));
    }

    public void AddNewStudent(List<Student>listOfStudents){
        this.AllStudentsList.addAll(listOfStudents);
    }

    public String toString(){
        return ""+AllStudentsList;
    }

}

public class AssociationExample {
    public static void main(String[] args) {

        Student s1 = new Student("Hasan");
        System.out.println(s1);
        Student s2 = new Student("Muge");
        Student s3 = new Student("Muhtar");
        Student s4 = new Student("Nikolay");
        Student s5 = new Student("Aiko");
        //School cybertek = new School();

        List<Student>list= new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));
        System.out.println(list);

        School cybertek = new School("Cybertek",list);
        cybertek.AddNewStudent(new Student("Alesya"));

        Student[] students ={
                new Student("Gena"),
                new Student("Rukshona")
        };

        cybertek.AddNewStudent(students);
        System.out.println(cybertek.AllStudentsList);
        System.out.println(cybertek.schoolName);
        System.out.println(cybertek);

        for(Student eachStudent: cybertek.AllStudentsList){
            System.out.println(eachStudent);
        }




    }
}

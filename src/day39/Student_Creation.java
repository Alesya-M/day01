package day39;



public class Student_Creation {
    public static void main(String[] args) {

        Student_Object s1 = new Student_Object();
        s1.name="Alesya";
        s1.age=30;
        s1.gender='F';
        System.out.println("s1 name "+ s1.name);

        System.out.println(s1.name+" | "+s1.age+" | "+s1.gender);
    }
}

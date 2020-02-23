package myOwnPractice.Day57;


interface Fatih{
    void readBook();
    abstract void watchTB();
}

abstract class Omer implements Fatih{
    public void readBook(){
        System.out.println("Omer is reading");
    }
}

public class Quizz {
}

package myOwnPractice.Day_55;


abstract class ScrumTeam{

    public String Name, JobTitle;
    public double salary;

    public abstract void DaileStandUp();
    public abstract void Demo();
}

class Testers extends ScrumTeam{

    @Override
    public void DaileStandUp() {
        
    }

    @Override
    public void Demo() {

    }
}


public class BOA {

}


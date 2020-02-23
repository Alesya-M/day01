package offficeHour.Muhtar_Abstraction;

public class Developers extends ScrumTeam {

    public Developers(String employeeName, double salary){

        jobTitle="Software developer";
        this.employeeName=employeeName;
        this.salary=salary;
    }


    @Override
    public void Demo() {
        System.out.println("Developer "+ this.employeeName+ " is doing demo");
    }

    @Override
    public void DailyStandUp() {
        System.out.println("Developer "+ this.employeeName+" is attending daily stand up");
    }

    public void fixingBugs(){
        System.out.println("Developer "+this.employeeName+" is crying");
    }
}

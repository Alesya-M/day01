package offficeHour.Muhtar_Abstraction;

public class Testers extends ScrumTeam  {

    //Inherited features:
    //                   variables: employeeName, jobTitle, salary
    //                   methods: getEmployeeInfo()

    public Testers(String employeeName, String jobTitle, double salary){
        this.employeeName=employeeName;
        this.jobTitle=jobTitle;
        this.salary=salary;

    }

    @Override
    public void Demo(){
        System.out.println("Tester "+this.employeeName+ " is doing demo");
    }

    @Override
    public void DailyStandUp(){
        System.out.println("Testers "+ this.employeeName+" is attending daily stand up");
    }

    public void foundBug(){
        System.out.println("Tester "+this.employeeName+" reported a bug");
    }

}

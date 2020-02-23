package offficeHour.Muhtar_Abstraction;

public abstract class ScrumTeam {

    public String employeeName;
    public String jobTitle;
    public double salary;

    public abstract void Demo();
    public abstract void DailyStandUp();



    public void getEmploeeInfo(){
        System.out.println("================");
        System.out.println("Employee Name "+ employeeName);
        System.out.println("Job Title "+jobTitle);
        System.out.println("salary: "+salary);
        System.out.println("================");
    }






}

package offficeHour.Muhtar_Abstraction;

public class BA extends ScrumTeam {

    public BA(String employeeName, double salary){
        this.jobTitle= "Business Analyst";
        this.employeeName= employeeName;
        this.salary=salary;
    }


    @Override
    public void Demo() {
        System.out.println("Business Analyst "+this.employeeName+" is doing demo");
    }

    @Override
    public void DailyStandUp() {
        System.out.println("Business Analyst "+ this.employeeName+" is attending daily Stand up");
    }

    public void gatherReq(){
        System.out.println("Business Analyst "+this.employeeName+" is gathering the requirement");
    }

}

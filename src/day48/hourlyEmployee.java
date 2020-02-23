package day48;

public class hourlyEmployee extends Employee{
    double hourlyWage;
    int numberOfHours;

    public hourlyEmployee(String name, int id, double hourlyWage, int numberOfHours) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.numberOfHours = numberOfHours;
    }

    public void calculateAnnualSalary(){
        System.out.println("Annual salary is "+ numberOfHours*hourlyWage*4*12+" $");
    }

    @Override
    public String toString() {
        return "hourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numberOfHours=" + numberOfHours +
                ", name='" + name + '\'' +
                ", id=" + id +" , monthly salary = "+ (numberOfHours*hourlyWage*4)+  " , annual salary = "+(numberOfHours*hourlyWage*4*12)+" $ }";
    }
}

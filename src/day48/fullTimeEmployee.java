package day48;

public class fullTimeEmployee extends Employee{
    double monthlySalary;

    public fullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public void calculateAnnualSalary(){
        System.out.println("Annual salary is "+ (monthlySalary*12)+" $");
    }

    @Override
    public String toString() {
        return "fullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", id=" + id +" annual salary = "+ (monthlySalary*12)+" $"+
                '}';
    }
}

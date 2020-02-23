package day48;

public class HR_Action {
    public static void main(String[] args) {
        
        hourlyEmployee e1 = new hourlyEmployee("Alesya",101,55.25,40);
        
        e1.calculateAnnualSalary();
        System.out.println("e1 = " + e1);
        
        hourlyEmployee e2 = new hourlyEmployee("Alesya Ultrasound Tech", 123,23.5,32);
        
        e1.calculateAnnualSalary();
        System.out.println("e2 = " + e2);

        fullTimeEmployee f1 = new fullTimeEmployee("Kolya",123,15000.00);
        f1.calculateAnnualSalary();
        System.out.println("f1 = " + f1);
        
        fullTimeEmployee f2 = new fullTimeEmployee("Gena",124,600);
        f2.calculateAnnualSalary();
        System.out.println("f2 = " + f2);
        
        hourlyEmployee e5 = new hourlyEmployee("Gennady",555,7.25,80);
        e5.calculateAnnualSalary();
        System.out.println("e5 = " + e5);
        
        
    }
}

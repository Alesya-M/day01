package day48;

import java.util.Arrays;
import java.util.List;

public class HR_Stuff {

    public static void main(String[] args) {

        //Employee is abstract super type
        //HourlyEmployee and FullTimeEmployee is specific type

        Employee e1 = new hourlyEmployee("Alesya",123,65.00,32);
        //Employee e1 ---> stores address of any Employee
//        e1.calculateAnnualSalary();
//        e1 = new fullTimeEmployee("Kolya",333,10000);
//        e1.calculateAnnualSalary();

        Employee e2 = new hourlyEmployee("Kolya",123,100.00,40);
        Employee e3 = new fullTimeEmployee("Nikolay",123,10000);

        List<Employee> allEmployee = Arrays.asList(e1, e2, e3);

        for( Employee each: allEmployee){
            //System.out.println("each = " + each);
            System.out.println("Name is : "+ each.name);
            each.calculateAnnualSalary();
        }


    }
}

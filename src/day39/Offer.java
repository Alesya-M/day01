package day39;

public class Offer {

    String location;
    String company;
    long salary;
    boolean isFullTime;

    //This is an instance method to print all the information about Offer object

    public void  displayInformation(){

        System.out.println("Location = " + location + " | " + "Company = " + company + " | "
                + "Salary = " + salary + " $ | " + "isFullTime = " + isFullTime);
    }

    public void turnToFullTima(){

        if(isFullTime==false) {
            isFullTime = true;
        }
    }

    public void changeLocation(String newLocation){

        location = newLocation;

    }

    public void changeAllInfo(String newCompany, String newLocation, long newSalary, boolean newIsFullTime){

        company = newCompany;
        location = newLocation;
        salary = newSalary;
        isFullTime = newIsFullTime;
        displayInformation();

    }

    //Write a method to check if the offer is = or more than 100K
    public boolean is100KOffer(){
        return  salary>100000;
    }

   public String toString(){

       String str = "[Location = " + location + " | " +
               "Company = " + company + " | " +
               "Salary = " + salary + " $ | " +
               "isFullTime = " + isFullTime+" ]";
       return str;
   }
}

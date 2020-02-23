package offficeHour;

public class Person_Practice {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.firstName = "Alesya";
        p1.lastName = "Malysheva";
        p1.DOB = "04/09/1989";

        p1.printInfo();

        Person p2 = new Person();
        p2.firstName= "Nikolay";
        p2.lastName="Karamov";
        p2.DOB = "11/08/1990";

        p2.printInfo();

    }
}

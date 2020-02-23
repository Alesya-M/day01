package day39;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class HotMarketActions {

    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;
        o1.displayInformation();


        Offer o2 = new Offer();
        o2.company = "Google";
        o2.location = "Boston";
        o2.isFullTime = true;
        o2.salary = 100000;
        o2.displayInformation();

        Offer o3 = new Offer();
        o3.company = "Amazon";
        o3.location = "Voncouver";
        o3.isFullTime = true;
        o3.salary = 96000;
        o3.displayInformation();

        Offer o4 = new Offer();
        o4.displayInformation();

        ArrayList<Offer> myOffers = new ArrayList<>(Arrays.asList(o1,o2,o3,o4));
        System.out.println("myOffers------------");

        for( Offer each : myOffers){
            each.displayInformation();
        }

        System.out.println("myOffers-------for loop------");

        for (int x = 0; x < myOffers.size(); x++) {

            //store each item in variable
            //myOffers.get(x).displayInformation();
            Offer each = myOffers.get(x);
            each.displayInformation();


        }




    }

}

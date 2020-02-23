package day39;

public class HotMarketActions3 {

    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;
        o1.displayInformation();


       o1.changeAllInfo("Amazon", "San Francisco", 150000, true);
      // o1.displayInformation();


        boolean result = o1.is100KOffer();
        if(result==true){
            o1.changeLocation("Atlanta");
        }
        o1.displayInformation();




    }

}

package day12;

public class CarShopping {

    public static void main(String[] args) {

        //Buy Corolla or Tesla only if it is within the budget

        String carBrand= "Tesla";
        int budget = 40000;
        int carPrice = 50000;

        //if (carBrand.equals("Corolla") ||  (carBrand.equals("Tesla") && carPrice<=budget) ){

           // System.out.println("Buy this car!");
        //} else {
           // System.out.println("Not your price range");

        if (carBrand.equals("Corolla")){
            System.out.println("Car acquired");
        } else if(carBrand.equals("Tesla")&& carPrice <=budget ){
            System.out.println("Car acquired");
        }else{
            System.out.println("Not what Im looking for");
        }


    }
}


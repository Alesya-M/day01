package day30;

public class arrayPract {
    public static void main(String[] args) {

        String []cars= {"Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic"};
        int countChevy=0;
        int countCivic=0;
//        for (int x = 0; x < carInventory.length; x++) {
////           for (int i = 0; i < carInventory[x].length()-1; i++) {
//            String car=carInventory[x];
//                if(car.contains("Chevrolet")){
//                    countChevy=countChevy++;
//                }else if(carInventory[x].contains("Civic")){
//                    countCivic=countCivic++;
//                }

            //}
        for(String eachCar : cars){

            if(eachCar.toLowerCase().startsWith("chevrolet")){
                countChevy++;
            }
            if(eachCar.toUpperCase().contains("CIVIC")){
                countCivic++;
            }

//            if( eachCar.startsWith("Chevrolet")){
//                countChevy++;
//            }


        }
        System.out.println("Chevy number: "+countChevy);
        System.out.println("Civic number: "+countCivic);

    }
}

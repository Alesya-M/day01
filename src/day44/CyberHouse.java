package day44;

public class CyberHouse {
    int houseNum;
    String design;
     static  String neighbourhoodName = "Cybertek Ave";

    public CyberHouse( String design,int houseNum){
        this.houseNum=houseNum;
        this.design=design;
    }



    public void showAllInfo(){
        System.out.println("house- "+houseNum+" design- "+design+" neighbourhoodName- "+ neighbourhoodName);
    }

    //static method can obly access static members of the same class
    public static void showNeighborhoodName(){
        System.out.println("neighbourhoodName- "+ neighbourhoodName);
        //CANNOT access anything non-static in static methods
        //System.out.println("houseNum= "+houseNum);
    }


}

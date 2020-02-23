package day40;

public class Product {
    //Make this Product a well encapsulated
    //make all the instance fields private so it can only be accessible in the same class
    //provide public getters and setters method

    //THIS KEYWORD used to refer to the current object
    //we are working on
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //    public String getName(){
//        return this.name;
//        //return name;
//    }
//
//    public void setName(String newName){
//        // name = newName;
//        this.name = name ;
//    }
//    //this always about the field value
//
//    public double getPrice(){
//        return this.price;
//    }
//
//    public void setPrice(double price){
//        if(price>0){
//            this.price = price;
//        }
//    }




}

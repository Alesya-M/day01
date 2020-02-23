package day56;

import java.util.ArrayList;
import java.util.List;

public class Store {

    String name;
    List<Product> allProducts;

    public Product getMostExpensiveProduct(){
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < allProducts.size() ; i++) {

            if(allProducts.get(i).getPrice()>max){
                max = (int) allProducts.get(i).getPrice();
                maxIndex = i;
            }
        }
        System.out.println("max = " + max);
        return allProducts.get(maxIndex);
    }

    public double getAveragePrice(){
        return findSumOfAllProducts()/getProductCount();
    }

    public int findSumOfAllProducts(){

        int sum = 0;
        for( Product each: allProducts){
            sum+=each.getPrice();
        }
        return sum;
    }
    public int indexOfProduct(Product p){
        return allProducts.indexOf(p);
    }
    public void removeProduct(Product p){
        if (checkIfProductExist(p) == true) {
            allProducts.remove(p);
        } else {
            System.out.println("We dont have " + p);
        }
    }

    public boolean checkIfProductExist(Product p){
        return allProducts.contains(p);
    }

    public int getProductCount(){
        return allProducts.size();
    }

    public void displayProducts(){
        System.out.println(name + " has below product: ");
        for(Product each : allProducts) {
            System.out.println("\t each = " + each);
        }
    }

    public void addProduct(Product P){
        System.out.println("calling allProducts.add(P)");
        allProducts.add(P);
    }

    public void addProduct(String productName, int productPrice){
        Product newP = new Product(productName,productPrice);
        allProducts.add(newP);
    }




    public Store(){
        this.name ="Cybertek Store";
        this.allProducts = new ArrayList<>();
}

    public Store(String name, List<Product> otherList) {
        this();
        this.name = name;
        allProducts.addAll(otherList);
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allProducts=" + allProducts +
                '}';
    }
}

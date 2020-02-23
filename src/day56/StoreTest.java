package day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest {
    public static void main(String[] args) {

        Store s1 = new Store();
        System.out.println(s1.name);
        System.out.println(s1.allProducts);
        s1.allProducts.add(new Product("imac",3999));
        System.out.println("s1.allProducts = " + s1.allProducts);

        List<Product> denisList = Arrays.asList(new Product("cookie", 3),
                new Product("tea",2.99),
                new Product("latte",4.00),
                new Product("Cupcake",3.99));

      Store s2 = new Store("Denis Store",denisList);
        System.out.println("s2 = " + s2);

        Product p1 = new Product("CheeseCake",10);
        s2.addProduct(p1);
        System.out.println("s2 = " + s2);
        s2.addProduct("Latte",3);
        System.out.println("s2 = " + s2);
        System.out.println(" s2.getProductCount "+s2.getProductCount());

        s2.displayProducts();

        System.out.println("Do we have cheesecake? Price 10$ "+ s2.checkIfProductExist(p1));
        System.out.println(s2.indexOfProduct(p1));
        s2.removeProduct(p1);

    }
}

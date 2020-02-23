package day26;

import java.util.Arrays;

public class countItemInAnArray {

    public static void main(String[] args) {

        //
        String []marvelHeroes = {"Iron Man", "Capitan America", "Spiderman", "Black Panther",
                                 "Hulk","Black Widow","Wanda","Capital Marvel","Black Widow","Wanda",
                                 "Capital Marvel","Iron Man", "Capitan America", "Spiderman"};

        System.out.println("Marvel Heroes ="+ Arrays.toString(marvelHeroes));
        int sizeOfArray = marvelHeroes.length ;
        System.out.println("Heroes count = " + sizeOfArray);

        String itemToSearch = "Capitan America";
        int countOfItem = 0;
        int countainsName=0;
        
        for( String eachHero : marvelHeroes ){
            
            if(eachHero.equals(itemToSearch)){
                countOfItem++;
            }else if (eachHero.contains("Black")){    ///IGNORE CASE DOES NOT WORK! USE eachHero.toLowerCase().contains("black")
                System.out.println(eachHero+"-HERE!");
                countainsName++;
            }

        }
        System.out.println("countOfItem = " + countOfItem);
        System.out.println("Count of word "+ countainsName);



    }
}

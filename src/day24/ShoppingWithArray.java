package day24;

public class ShoppingWithArray {

    public static void main(String[] args) {

        //String [] groceryItems = new String[6];
        //String [] groceryItems = new String[]{"apple","banana", "grape", "strawberry","blueberry","kiwi"};
        String [] groceryItems = {"apple","banana", "grape", "strawberry","blueberry","kiwi"};

        int itemCount = groceryItems.length;
        int lastItemIndex = itemCount-1;
        String lastFruit =groceryItems[lastItemIndex];

        for( String eachFruit : groceryItems ){

            System.out.print( eachFruit);
            //only print arrow when the fruit is not last item
            if(!eachFruit.equals(lastFruit)){
                System.out.print("--->");
            }

        }

    }
}

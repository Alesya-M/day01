package repl;
import java.util.Scanner;
public class repl126 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String str = scan.nextLine();

        String[]strArray=str.split(", ");
        String shortestWord = strArray[0];
        for(String eachWord : strArray){
            if(eachWord.length()<shortestWord.length()){
                shortestWord=eachWord;
            }
        }

        String allShortest="";
        for(String each1 : strArray){
            if(each1.length()==shortestWord.length()){
                allShortest+=each1+" ";
            }
        }

        System.out.println(allShortest);


    }


}

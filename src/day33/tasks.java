package day33;

public class tasks {
    public static void main(String[] args) {
        System.out.println(ageCalculator(1990));
    }

    public static int ageCalculator(int birthYear){

        if(birthYear<=1900 || birthYear>=2020 ){
            return 0;
        }

        return 2019-birthYear;
    }

    String string ="";
}

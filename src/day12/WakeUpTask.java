package day12;

public class WakeUpTask {

    public static void main(String[] args) {

        String weather="Rainy";

        if(weather.equals("Snowy")){
            System.out.println("Code in snowy weather");
        }else if(weather.equals("Rainy")){
            System.out.println("Code in rainy weather");
        }else if(weather.equals("cloudy")){
            System.out.println("Code in rainy weather");
        }else if(weather.equals("sunny")){
            System.out.println("Code in sunny weather");
        }else{
            System.out.println("Rain or shine keep coding anyway!");
        }
    }
}

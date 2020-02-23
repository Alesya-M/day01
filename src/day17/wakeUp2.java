package day17;

public class wakeUp2 {

    public static void main(String[] args) {

        String name ="niKolay";

        String nameFixed= (name.charAt(0)+"").toUpperCase() ;
               nameFixed= nameFixed+name.substring(1).toLowerCase();
        System.out.println("nameFixed=" + nameFixed);


        String name2 ="alesya";

        String name3= name2.toUpperCase().substring(0,1);
               name3= name2.substring(1).toLowerCase();

        System.out.println("nameFixed = " + name3);
    }
}

package offficeHour.Muhtar_Abstraction;

import day48.Lion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class apple {

    public static void main(String[] args) {

        //apple and testers have "HAS A " RELATIONSHIP
        //NO INHERITANCE

        Testers Alesya = new Testers("Alesya","SDET",130000);
        Alesya.jobTitle= "Manual Tester";
        System.out.println(Alesya.jobTitle);
        Alesya.getEmploeeInfo();

        Testers Alisa = new Testers("Alisa","SDET",120000);
        Testers Rauf = new Testers("Rauf","QA",100000);

        List<Testers> testersTeam = new ArrayList<>();
        testersTeam.addAll(Arrays.asList(Alesya,Alisa,Rauf));

        /*

        for( Testers eachTester :  testersTeam) {
            eachTester.getEmploeeInfo();
            System.out.println("====================");
        }
*/




        Developers Vladislav = new Developers("Vladislav", 130000);
        System.out.println(Vladislav.employeeName);
        Vladislav.getEmploeeInfo();

        Developers Emel = new Developers("Emel", 135000);
        Developers Muge = new Developers("Muge", 136000);

        List<Developers> developersTeam = new ArrayList<>();
        developersTeam.addAll(Arrays.asList(Emel,Vladislav, Muge));

//        for( Developers eachDeveloper : developersTeam){
//            eachDeveloper.fixingBugs();
//        }

        List<ScrumTeam> scrum = new ArrayList<>();
        scrum.addAll(testersTeam); //parent class can reference to the child class
        scrum.addAll(developersTeam);

        for ( ScrumTeam eachMember  : scrum){
            eachMember.getEmploeeInfo();

        }

    }
}

package offficeHour.Muhtar_Abstraction;

import myOwnPractice.Day48_MethodOverriding.Bank;
import myOwnPractice.Day_54.Test;

import java.lang.reflect.Array;

public class BankOA {
    public static void main(String[] args) {

        BA Mohammed = new BA("Mohammed",156000);
        Mohammed.getEmploeeInfo();

        BA Parvin = new BA("Parvin",145000 );

        Testers Sevim = new Testers("Sevim", "QA", 120000);
        Testers Gunel = new Testers("Gunel","Manual Tester", 100000);
        Testers Serife = new Testers("Serife","SDET", 130000);

        Testers[] tester = {Serife, Gunel,Sevim};

        BA[] BATeam = {Parvin,Mohammed}; //Data type is BA

        ScrumTeam[][] scrum = {tester, BATeam};

        for( ScrumTeam [] eachArray : scrum ){
            for(ScrumTeam eachMember : eachArray){
                eachMember.getEmploeeInfo();
            }
        }




    }
}

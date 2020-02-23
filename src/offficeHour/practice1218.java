package offficeHour;

import day16.CountTo10;
import org.w3c.dom.ls.LSOutput;

public class practice1218 {
    public static void main(String[] args) {

        String employee = "Philipa Salthous [Electrical Engineer] psalthouse0@g.co";
        //print job title from this String: Electrical Engineer
        int startingIndex = employee.indexOf("[")+1;
        int endingIndex = employee.indexOf("]");

        String title = employee.substring(startingIndex,endingIndex);
        System.out.println("title= "+ title);
        //employee.replace("[","");
        String fullName = employee.substring(0,employee.indexOf(" ["));

        System.out.println("fullName= "+fullName);
        String fullNameWithDash = fullName.replace(" ","-");
        System.out.println("fullNAmeWithDAsh= "+ fullNameWithDash );

        System.out.println(fullNameWithDash+ " "+title);
        //String fullName= (employee.substring(0,employee.indexOf(" [")).replace(" ", "-"));
        //System.out.println(fullName.charAt(0)+""+fullName.charAt(fullName.lastIndexOf(" ")+1))+"->"+title);



    }
}

package day62;
import day61.Job;

import java.util.*;
public class JobTreeSet {
    public static void main(String[] args) {
    SortedSet<Job>sortJob = new TreeSet<>();
    
    sortJob.add(new Job("Fl",120000,"At&T"));
        sortJob.add(new Job("LA",120000,"BBC"));
        sortJob.add(new Job("TX",150000,"APPLE"));
        sortJob.add(new Job("CA",100000,"Amazon"));
        sortJob.add(new Job("VA",110000,"USPTO"));
        
        for(Job each : sortJob){
            System.out.println("each = " + each);
        }
        
    
    
    

    }
}

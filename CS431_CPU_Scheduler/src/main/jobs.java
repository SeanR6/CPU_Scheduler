package main;

import java.util.ArrayList;
import java.util.Comparator;


public class jobs {
    public ArrayList<job> myJobs = new ArrayList<>();
    private int totalJobs;
    //retrieve jobs from file here
    jobs() {
        //while != eof get jobs
        //test data
        myJobs.add(new job("Job 1", 1));
        myJobs.add(new job("Job 2", 10));
        myJobs.add(new job("Job 3", 5));
        myJobs.add(new job("Job 4", 3));

        //make modifiable copy
        totalJobs = myJobs.size();
    }

    public int getLength(){
        return myJobs.size();
    }

    public int getTotalJobs(){
        return totalJobs;
    }

    public void sortByTime() {
        myJobs.sort(Comparator.comparing(job::getTime));
    }

}

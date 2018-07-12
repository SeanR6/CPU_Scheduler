package main;

public class FirstComeFirstServe {
    jobs myJobs;
    int jobsLeft;

    //modifiable jobs needs to be passed here
    public FirstComeFirstServe(jobs x){
        myJobs = x;
        jobsLeft = myJobs.getLength();
        //use a counter to keep track of gantt time7
    }
}

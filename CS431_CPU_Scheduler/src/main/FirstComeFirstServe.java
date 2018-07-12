package main;

public class FirstComeFirstServe {
    jobs myJobs;
    int jobsLeft;
    int time;
    int curIndex;
    //this is for adding all the jobs when they are finished, adds them up. Needs to divide by jobs to get avg
    int finishedTimes;

    public FirstComeFirstServe(jobs x){
        myJobs = x;
        jobsLeft = myJobs.getLength();
        myJobs.resetModifiedJobs();
        time = 0;
        curIndex = 0;

        //use a counter to keep track of gantt time
        while (myJobs.getLength() > 0){

        }
    }
}

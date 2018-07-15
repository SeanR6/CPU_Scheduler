package main;

public class FirstComeFirstServe {
    jobs myJobs;
    int time;
    int curIndex;
    //this is for adding all the jobs when they are finished, adds them up. Needs to divide by jobs to get avg

    public FirstComeFirstServe(jobs x){
        myJobs = x;
        int totalJobs = myJobs.getTotalJobs();
        myJobs.resetModifiedJobs();
        time = 0;
        curIndex = 0;

        //use a counter to keep track of gantt time
        //This is essentially a queue type structure, the top value is the one removed
        //TODO put this in its own class?
        while (myJobs.getLength() > 0){
            time = time + myJobs.modifiableJobs.get(0).getTime();
            System.out.println(myJobs.modifiableJobs.get(0).getName() + " finished at clock time " + time);
            myJobs.modifiableJobs.remove(0);
        }
        int averageTime = time/totalJobs;
        System.out.println("Processes finished with an average time of: " + averageTime);
    }
}

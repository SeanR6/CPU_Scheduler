package main;

public class FirstComeFirstServe {
    jobs myJobs;
    int time;
    int totalJobs;
    double averageTime;
    int totalTime;
    //this is for adding all the jobs when they are finished, adds them up. Needs to divide by jobs to get avg

    public FirstComeFirstServe(jobs x){
        System.out.println("\nRunning FCFS");
        myJobs = x;
        totalJobs = myJobs.getTotalJobs();
        time = 0;

        //use a counter to keep track of gantt time
        //This is essentially a queue type structure, the top value is the one removed
        //TODO put this in its own class?
        while (myJobs.getLength() > 0){
            time = time + myJobs.myJobs.get(0).getTime();
            totalTime = totalTime + time;
            System.out.println(myJobs.myJobs.get(0).getName() + " finished at clock time " + time);
            myJobs.myJobs.remove(0);
        }
        averageTime = (double) totalTime / totalJobs;
        System.out.println("Processes finished with an average time of: " + averageTime);
    }
}

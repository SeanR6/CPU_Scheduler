package main;

class FirstComeFirstServe {
    private int totalTime;
    //this is for adding all the jobs when they are finished, adds them up. Needs to divide by jobs to get avg

    FirstComeFirstServe(jobs myJobs) {
        System.out.println("\nRunning FCFS");
        int totalJobs = myJobs.getTotalJobs();
        int time = 0;

        while (myJobs.getLength() > 0){
            System.out.println("Working on " + myJobs.myJobs.get(0).getName() + " at time " + time);
            time = time + myJobs.myJobs.get(0).getTime();
            totalTime = totalTime + time;
            System.out.println(myJobs.myJobs.get(0).getName() + " finished at clock time " + time);
            myJobs.myJobs.remove(0);
        }
        double averageTime = (double) totalTime / totalJobs;
        System.out.println("Processes finished with an average time of: " + averageTime);
    }
}

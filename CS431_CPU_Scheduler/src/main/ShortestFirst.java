package main;

public class ShortestFirst {
    double averageTime;
    int totalTime;
    private jobs myJobs;
    private int time;
    private int totalJobs;

    public ShortestFirst(jobs x) {
        System.out.println("\nRunning Shortest First");
        myJobs = x;
        myJobs.sortByTime();
        totalJobs = myJobs.getTotalJobs();

        //todo put this in its own class
        while (myJobs.getLength() > 0) {
            time = time + myJobs.myJobs.get(0).getTime();
            totalTime = totalTime + time;
            System.out.println(myJobs.myJobs.get(0).getName() + " finished at clock time " + time);
            myJobs.myJobs.remove(0);
        }
        averageTime = (double) totalTime / totalJobs;
        System.out.println("Processes finished with an average time of: " + averageTime);
    }
}

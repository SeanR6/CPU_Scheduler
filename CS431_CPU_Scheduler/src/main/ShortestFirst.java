package main;

class ShortestFirst {

    ShortestFirst(jobs myJobs) {
        System.out.println("\nRunning Shortest First");
        myJobs.sortByTime();
        int totalJobs = myJobs.getTotalJobs();
        int time = 0;
        int totalTime = 0;

        while (myJobs.getLength() > 0) {
            time = time + myJobs.myJobs.get(0).getTime();
            totalTime = totalTime + time;
            System.out.println(myJobs.myJobs.get(0).getName() + " finished at clock time " + time);
            myJobs.myJobs.remove(0);
        }
        double averageTime = (double) totalTime / totalJobs;
        System.out.println("Processes finished with an average time of: " + averageTime);
    }
}

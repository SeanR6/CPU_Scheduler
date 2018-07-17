package main;

class RoundRobin {

    //n is the time quanta chosen
    RoundRobin(int timeQ, jobs myJobs) {
        //Algorithm Used:
        //loop while there are still processes in the array list
        //use mod total items, to keep track of which thing to be working on.
        //subtract time by n at the most, if remaining time is equal to zero remove it
        //if remaining time is equal to zero remove it.
        //if time is greater than zero, add back the time taken away, then remove the item

        double avgTime = 0;
        int currentJob = 0;
        int timeCounter = 0;
        int jobTime;
        System.out.println("\nRunning round robin with time quanta " + timeQ);
        //add if statement for final job, to just take car of it all at once, also might avoid issues that way
        while(myJobs.getLength() > 1){
            timeCounter += timeQ;
            jobTime = myJobs.myJobs.get(currentJob).getTime();
            jobTime = jobTime - timeQ;

            if(jobTime <= 0) {
                //the + jobTime allows for the case where jobTime < 0
                timeCounter = timeCounter + jobTime;
                System.out.println(myJobs.myJobs.get(currentJob).getName() + " has been completed at time " + timeCounter);
                myJobs.myJobs.remove(currentJob);
                currentJob = currentJob - 1;
                avgTime = avgTime + timeCounter;
            } else {
                myJobs.myJobs.get(currentJob).subTime(timeQ);
            }
            currentJob = (currentJob + 1) % myJobs.getLength();
        }
        timeCounter = timeCounter + myJobs.myJobs.get(0).getTime();
        System.out.println(myJobs.myJobs.get(currentJob).getName() + " has been completed at time " + timeCounter);
        avgTime = avgTime + timeCounter;
        avgTime = avgTime / myJobs.getTotalJobs();
        System.out.println("Average Time: " + avgTime);
    }
}

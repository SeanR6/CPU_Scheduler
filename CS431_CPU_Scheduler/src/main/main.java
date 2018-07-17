package main;

public class main {
    public static void main(String[] args){
        //get number of jobs to initialize
        //read the jobs to an array, then send them to a new jobs data structure
        //run each of the algorithms in order, each will be in its own class
        //make a sorting algorithm for shortest job first

        //TODO for round robin, make the time quanta an input for the class
        jobs myJobs = new jobs();
        new FirstComeFirstServe(myJobs);
        myJobs = new jobs();
        new ShortestFirst(myJobs);
        myJobs = new jobs();
        new RoundRobin(2, myJobs);
        myJobs = new jobs();
        new RoundRobin(5, myJobs);
    }
}

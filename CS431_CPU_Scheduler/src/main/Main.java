package main;

public class Main {
    public static void main(String[] args){
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

package main;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        jobs myJobs = new jobs("testdata1.txt");
        new FirstComeFirstServe(myJobs);
        myJobs = new jobs("testdata2.txt");
        new FirstComeFirstServe(myJobs);
        myJobs = new jobs("testdata3.txt");
        new FirstComeFirstServe(myJobs);

        myJobs = new jobs("testdata1.txt");
        new ShortestFirst(myJobs);
        myJobs = new jobs("testdata2.txt");
        new ShortestFirst(myJobs);
        myJobs = new jobs("testdata3.txt");
        new ShortestFirst(myJobs);

        myJobs = new jobs("testdata1.txt");
        new RoundRobin(2, myJobs);
        myJobs = new jobs("testdata2.txt");
        new RoundRobin(2, myJobs);
        myJobs = new jobs("testdata3.txt");
        new RoundRobin(2, myJobs);

        myJobs = new jobs("testdata1.txt");
        new RoundRobin(5, myJobs);
        myJobs = new jobs("testdata2.txt");
        new RoundRobin(5, myJobs);
        myJobs = new jobs("testdata3.txt");
        new RoundRobin(5, myJobs);
    }
}

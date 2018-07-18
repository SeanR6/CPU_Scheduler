package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class jobs {
    public ArrayList<job> myJobs = new ArrayList<>();
    private int totalJobs;
    //retrieve jobs from file here
    jobs(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            myJobs.add(new job(scan.nextLine(), Integer.valueOf(scan.nextLine())));
        }
        scan.close();
        totalJobs = myJobs.size();
    }

    public int getLength(){
        return myJobs.size();
    }

    public int getTotalJobs(){
        return totalJobs;
    }

    public void sortByTime() {
        myJobs.sort(Comparator.comparing(job::getTime));
    }

}

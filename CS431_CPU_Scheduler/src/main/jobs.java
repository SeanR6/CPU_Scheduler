package main;

import java.util.ArrayList;

public class jobs {
    private ArrayList<job> myJobs = new ArrayList<>();
    public ArrayList<job> modifiableJobs;
    private int totalJobs;
    //retrieve jobs from file here
    public jobs(){
        //while != eof get jobs
        //test data
        myJobs.add(new job("Job 1", 1));
        myJobs.add(new job("Job 2", 10));
        myJobs.add(new job("Job 3", 5));
        myJobs.add(new job("Job 4", 3));

        //make modifiable copy
        modifiableJobs = myJobs;
        totalJobs = myJobs.size();
    }

    public int getLength(){
        return myJobs.size();
    }

    public void resetModifiedJobs(){
        modifiableJobs = myJobs;
    }

    //checks if job is finished, removes job if it is
    //TODO wtf is going on here? What is name? change to index or something maybe?
    //TODO check return statements, this is confusing
    //I Think this is used for RR where we need to see if an item is finished, rethink the string idea though, thats a bad idea
    public boolean checkIfFinished(String Name){
        int index = modifiableJobs.indexOf(Name);
        if(index != -1){
            if(modifiableJobs.get(index).getTime() == 0){
                removeJob(index);
                return true;
            }
        }
        return false;
    }

    private void removeJob(int index){
        System.out.print(modifiableJobs.get(index).getName() + "has been completed");
        modifiableJobs.remove(index);
    }

    private void subTime(int index){
        modifiableJobs.get(index).subTime();
    }

    public int getTotalJobs(){
        return totalJobs;
    }

}

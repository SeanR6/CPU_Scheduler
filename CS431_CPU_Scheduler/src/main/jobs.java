package main;

import java.util.ArrayList;
import java.util.List;

//TODO use arrayList instead of array
//try using a data structure for a job, and then a separate class that contains the list of them
public class jobs {
    ArrayList<job> myJobs = new ArrayList<>();
    ArrayList<job> modifiableJobs;
    //retrieve jobs from file here
    public jobs(){
        //while != eof get jobs
        //test data
        myJobs.add(new job("job1", 1));
        myJobs.add(new job("job2", 2));

        //make modifiable copy
        modifiableJobs = myJobs;
    }

    public int getLength(){
        return myJobs.size();
    }

    public void resetModifiedJobs(){
        modifiableJobs = myJobs;
    }
    //checks if job is finished, removes job if it is
    public void checkIfFinished(String Name){
        int index = modifiableJobs.indexOf(Name);
        if(index != -1){
            if(modifiableJobs.get(index).getTime() == 0){
                removeJob(index);
            }
        }
    }

    private void removeJob(int index){
        System.out.print(modifiableJobs.get(index).getName() + "has been completed");
        modifiableJobs.remove(index);
    }
}

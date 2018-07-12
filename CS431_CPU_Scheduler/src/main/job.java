package main;

public class job {
    private String name;
    private int time;

    public job(String x, int y){
        name = x;
        time = y;
    }

    public String getName(){
        return name;
    }
    public int getTime(){
        return time;
    }
}

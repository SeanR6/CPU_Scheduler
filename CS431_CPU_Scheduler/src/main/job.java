package main;
//reconsider this class? maybe we don't need a name?
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
    public int subTime() {return time-1;}
}

import java.util.*;
public class Student{
    private String ID;
    private String name;
    private int grade;
    private double timeAbsent;
    //List<scanEvent> eventList = new LinkedList<scanEvent>();
    
    //getter and setter methods
    public void setID(String ID){
        this.ID=ID;
    }
    public String getID(){
        return ID;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setGrade(int grade){
        this.grade=grade;
    }
    public int getGrade(int grade){
        return grade;
    }
    public void setTimeAbsent(double timeAbsent){
        this.timeAbsent=timeAbsent;
    }
    public double getTimeAbsent(){
        return timeAbsent;
    }
}

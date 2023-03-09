import java.util.*;
public class Master{
    Map<String,Student> studentList = new HashMap<String,Student>();
    List<ScanEvent> eventList = new LinkedList<ScanEvent>();
    public void addAttendance(Student student){
        studentList.put(student.getID(),student);
    }

    public void scan(ScanEvent scan){
        eventList.add(scan);
        studentList.get(scan.getID()).addEvent(scan);
    }

    public void printEventList(){
        for(ScanEvent se: eventList)
            System.out.println("["+se.getID()+"]    :   "+studentList.get(se.getID()).getName()+" :    "+studentList.get(se.getID()).getGrade()+"    :    "+se.getTime()+"  :");
    }

    public void printStudentList(){
        for (Map.Entry<String,Student> entry : studentList.entrySet()) 
            System.out.println("ID:" + entry.getKey() +",   NAME:" + entry.getValue());
    }
}

import java.time.*;
public class ScanEvent{
    private String ID = "";
    private LocalDateTime timeScanned;
    
    public ScanEvent(String ID){
        this.ID = ID;
        timeScanned = LocalDateTime.now();
    }
    public ScanEvent(String ID, LocalDateTime timeScanned){
        this.ID = ID;
        this.timeScanned = timeScanned;
    }
    
    public String getID(){
        return ID;
    }
    public LocalDateTime getTime(){
        return timeScanned;
    }
}
import java.util.*;
import java.time.*;
public class Driver
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to do");
        System.out.println("1) Add a new student to the attendance");
        System.out.println("2) Initiate a scan event");
        String input = scan.nextLine();
        
        
        
        while(!input.equals("1")||!input.equals("2")){System.out.println("Unkown input");input = scan.nextLine();}
        if(input.equals("1")){
            System.out.println("\fInput the name of the student:");
            String studentName = scan.nextLine();
            System.out.println("\fInput the ID of "+studentName+":");
            String ID = scan.nextLine();
            
            //add in the attendance built within master system
        }
        else{
            System.out.println("\fInput the ID:");
            String ID = scan.nextLine();
            System.out.println("\fInput the hour of the scan:");
            int hour = scan.nextInt();
            System.out.println("\fInput the minute of the scan:");
            int minute = scan.nextInt();
            System.out.println("\fInput the second of the scan:");
            int second = scan.nextInt();
            LocalDateTime ldt = LocalDateTime.of(LocalDateTime.now().getYear(),LocalDateTime.now().getMonth(),LocalDateTime.now().getDayOfMonth(),hour,minute,second);
            //create a scan event and send it rhough the mastersystem
        }
    }
}

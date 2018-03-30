
import java.io.BufferedReader;
import java.io.FileReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amrish
 */
public class ATSManager {
    String file[]= new String[5];
    private TimeSlots [] TimeSlot;
    private Instructors [] Instructor;
    private Sections [] Section;
    private Rooms [] Room;
    private Courses [] Course;
    
    public static void main(String []args){
        ATSManager myMgr=new ATSManager();
        InputFile inPath=new InputFile();
        inPath.form1();
            myMgr.readPath();
            String TimeSlotsPath= myMgr.file[0];
            String InstructorPath=myMgr.file[2];
            String SectionPath=myMgr.file[3];
            String RoomPath=myMgr.file[4];
            String CoursePath=myMgr.file[1];
            //option=sc.nextInt();
        DataManager dataMgr=new DataManager();
        /*myMgr.TimeSlot=dataMgr.TimeSlotRead(TimeSlotsPath);
        myMgr.Instructor=dataMgr.InstructorRead(InstructorPath);
        myMgr.Course=dataMgr.CourseRead(CoursePath);
        myMgr.Room=dataMgr.RoomRead(RoomPath);
        myMgr.Section=dataMgr.SectionRead(SectionPath);
        myMgr.Display(myMgr.TimeSlot);*/
    }
    public void readPath(){
         try{
            BufferedReader reader= new BufferedReader(new FileReader("filepath.txt"));
            String online= reader.readLine();
            int i=0;
            while(online!=null){
                //String[] file = null;
                file[i]= online;
                online= reader.readLine();
                i++;
            }
            
        }
        catch(Exception e){
            
        }
    }
    
    public void Display(TimeSlots [] TimeSlot){
        int i=1;
            while(TimeSlot[i]!=null){
                System.out.println("id="+TimeSlot[i].getId()+
                                    ", Day="+TimeSlot[i].getDay()+
                                    ", Slot="+TimeSlot[i].getSlot()+
                                    ", StartTime="+TimeSlot[i].StartTime()+
                                    ", EndTime="+TimeSlot[i].EndTime()
                                   );
                        i++;
            }
    }
    
}

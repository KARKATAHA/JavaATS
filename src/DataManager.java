
import java.io.*;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amrish
 */
public class DataManager {
     String file[]= new String[5];
    
    private TimeSlots [] TimeSlot;
    private Instructors [] Instructor;
    private Sections [] Section;
    private Rooms [] Room;
    private Courses [] Course;
    private int len=0;
    
    //Default constructor
   
    //Parameterised constructor
    public DataManager(){
        TimeSlot=new TimeSlots[100];
        Instructor=new Instructors[100];
        Section=new Sections[100];
        Room=new Rooms[100];
        Course=new Courses[100];
    }
    
    //Reading timeslots.csv file.
    
    public TimeSlots[] TimeSlotRead(String path){
        
        int id;
        String day;
        String slot;
        String starttime;
        String endtime;
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        int i=0;
                while ((line = br.readLine()) != null){
                    // use comma as separator
                    String[] cols = line.split(",");
                    //System.out.println("Coulmn 1= " + cols[1] + " , Column 2=" + cols[2]);
                    id=i;
                    day=cols[0];
                    slot=cols[1];
                    starttime=cols[2];
                    endtime=cols[3];
                    TimeSlot[i]=new TimeSlots(id,day,slot,starttime,endtime);
                    i++;   
                    //System.out.println(cols[3]);
                    //System.out.println(line);
                }
                //Printint the table. to check.
                    
                /*i=1;
                while(TimeSlot[i]!=null){
                    System.out.println("id="+TimeSlot[i].getId()+
                                        ", Day="+TimeSlot[i].getDay()+
                                        ", Slot="+TimeSlot[i].getSlot()+
                                        ", StartTime="+TimeSlot[i].StartTime()+
                                        ", EndTime="+TimeSlot[i].EndTime()
                                       );
                            i++;
                } */  
        }
        catch (FileNotFoundException e){
            //do something clever with the exception
            System.out.println(e);
        }
        catch (IOException e) {
                //do something clever with the exception
                System.out.println(e);
        }
        catch (NumberFormatException e) {
            System.out.println(e);
        }
        return TimeSlot;        
    }
    
    //Reading instructors.csv file.
    
    public Instructors[] InstructorRead(String path){
         int id;
         String Name;
         String Expertise1;
         String Expertise2;
         String Expertise3;
         String Expertise4;
         try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            int i=1;
                line = br.readLine();
                while ((line = br.readLine()) != null){
                    // use comma as separator
                    String[] cols = line.split(",");
                    //System.out.println("Coulmn 1= " + cols[1] + " , Column 2=" + cols[2]);
                    
                    id=i;
                    Name=cols[0];                  
                    if(cols.length<5){
                        if(cols.length<4){
                            if(cols.length<3){
                                Expertise1=cols[1];
                                Instructor[i]=new Instructors(id,Name,Expertise1);
                            }
                            else{
                                Expertise1=cols[1];
                                Expertise2=cols[2];
                                Instructor[i]=new Instructors(id,Name,Expertise1,Expertise2);
                            }
                        }
                        else{
                            Expertise1=cols[1];
                            Expertise2=cols[2];
                            Expertise3=cols[3];
                            Instructor[i]=new Instructors(id,Name,Expertise1,Expertise2,Expertise3);
                        }
                    }
                    else{
                         Expertise1=cols[1];
                         Expertise2=cols[2];
                         Expertise3=cols[3];
                         Expertise4=cols[4];
                    Instructor[i]=new Instructors(id,Name,Expertise1,Expertise2,Expertise3,Expertise4);
                    }
                    i++;
                    
                    }
                    
                    //System.out.println(line);
                
                //Printint the table. to check.
                    
                i=1;
                while(Instructor[i]!=null){
                    System.out.println("id="+Instructor[i].getId()+
                                       ", Name="+Instructor[i].getName()+
                                       ", Expertise1="+Instructor[i].getExpertise1()+
                                       ", Expertise2="+Instructor[i].getExpertise2()+
                                       ", Expertise3="+Instructor[i].getExpertise3()+
                                       ", Expertise4="+Instructor[i].getExpertise4()
                                       );
                    i++;
                }   
        }
        catch (FileNotFoundException e){
            //do something clever with the exception
            System.out.println(e);
        }
        catch (IOException | NumberFormatException e) {
                //do something clever with the exception
                System.out.println(e);
        }
        return Instructor;
    }
    
    //Reading sections.csv file.
    
    public Sections[] SectionRead(String path){
        
        int year;
        String section;
        String labSection;
        int inrolment;
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            int i=1;
                line = br.readLine();
                while ((line = br.readLine()) != null){
                    // use comma as separator
                    String[] cols = line.split(",");
                    //System.out.println("Coulmn 1= " + cols[1] + " , Column 2=" + cols[2]);
                    
                    year=Integer.parseInt(cols[0]);
                    section=cols[1];
                    labSection=cols[2];
                    inrolment=Integer.parseInt(cols[3]);
                    Section[i]=new Sections(year,section,labSection,inrolment);
                    i++;}                    
                    //System.out.println(line);
                
                    //Printint the table. to check.
                    
                    i=1;
                    while(Section[i]!=null){
                        System.out.println("Year="+Section[i].getYear()+", Section="+Section[i].getSection()
                                           +", LabSection="+Section[i].getLabSection()
                                           +", Inrolment="+Section[i].getInrolment());
                        i++;
                    }   
        }
        catch (FileNotFoundException e){
            //do something clever with the exception
            System.out.println(e);
        }
        catch (IOException e){
                //do something clever with the exception
                System.out.println(e);
        }
        catch (NumberFormatException nfe){
            System.out.println(nfe);
        }
        return Section;
    }
    
    //Reading rooms.csv file.
    
    public Rooms [] RoomRead(String Path){
        String resource;
        String type;
        int capacity;       
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(Path));
            String line;
            int i=1;
                line = br.readLine();
                while ((line = br.readLine()) != null){
                    // use comma as separator
                    String[] cols = line.split(",");
                    //System.out.println("Coulmn 1= " + cols[1] + " , Column 2=" + cols[2]);
                    
                    resource=cols[0];
                    type=cols[1];
                    capacity=Integer.parseInt(cols[2]);
                    Room[i]=new Rooms(resource,type,capacity);
                    i++;}                    
                    //System.out.println(line);
                
                    //Printint the table. to check.
                    
                    i=1;
                    while(Room[i]!=null){
                        System.out.println("Resource="+Room[i].getResource()+
                                           ", Type="+Room[i].getType()+
                                           ", Capacity="+Room[i].getCapacity());
                        i++;
                    }   
        }
        catch (FileNotFoundException e){
            //do something clever with the exception
            System.out.println(e);
        }
        catch (IOException | NumberFormatException e){
                //do something clever with the exception
                System.out.println(e);
        }
        return Room;
    }
    
    //Reading courses.csv file.
    
    public Courses [] CourseRead(String Path){
        String code;
        String name;
        int contactSlot;
        String courseType;
        String resourceType;
        String association;
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(Path));
        String line;
        int i=0;
                line = br.readLine();
                while ((line = br.readLine()) != null){
                    // use comma as separator
                    String[] cols = line.split(",");
                    //System.out.println("Coulmn 1= " + cols[1] + " , Column 2=" + cols[2]);
                    code=cols[0];
                    name=cols[1];
                    contactSlot=Integer.parseInt(cols[2]);
                    courseType=cols[3];
                    resourceType=cols[4];                   
                    if(cols.length<6){                        
                        Course[i]=new Courses(code,name,contactSlot,courseType,resourceType);
                    }
                    else{
                    association=cols[5];
                    Course[i]=new Courses(code,name,contactSlot,courseType,resourceType,association);
                    }
                    i++;   
                    //System.out.println(cols[3]);
                    //System.out.println(line);
                }
                //Printint the table. to check.
                    
                i=1;
                while(Course[i]!=null){
                    System.out.println("id="+TimeSlot[i].getId()+
                                        ", Day="+TimeSlot[i].getDay()+
                                        ", Slot="+TimeSlot[i].getSlot()+
                                        ", StartTime="+TimeSlot[i].StartTime()+
                                        ", EndTime="+TimeSlot[i].EndTime()
                                       );
                            i++;
                }   
        }
        catch (FileNotFoundException e){
            //do something clever with the exception
            System.out.println(e);
        }
        catch (IOException e) {
                //do something clever with the exception
                System.out.println(e);
        }
        catch (NumberFormatException e) {
            System.out.println(e);
        }
        return Course;
    }
    
}

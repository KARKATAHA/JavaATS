/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amrish
 */
public class TimeSlots {
    private int id;
    private String day;
    private String slot;
    private String starttime;
    private String endtime;
    public TimeSlots(int id, String day,String slot,String starttime,String endtime){
        this.id=id;
        this.day=day;
        this.slot=slot;
        this.starttime=starttime;
        this.endtime=endtime;
    }
    public int getId(){
        return id;
    }
    public String getDay(){
        return day;
    }
    public String getSlot(){
        return slot;
    }
    public String StartTime(){
        return starttime;
    }
    public String EndTime(){
        return endtime;
    }
}

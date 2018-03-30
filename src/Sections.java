/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amrish
 */
public class Sections {
    private int year;
    private String section;
    private String labSection;
    private int inrolment;
    
    public Sections(int year,String section,String labSection,int inrolment){
        this.year=year;
        this.section=section;
        this.labSection=labSection;
        this.inrolment=inrolment;
    }
    
    public int getYear(){
        return year;
    }
    
    public String getSection(){
        return section;
    }
    
    public String getLabSection(){
        return labSection;
    }
    
    public int getInrolment(){
        return inrolment;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amrish
 */
public class Courses {
    private String code;
    private String name;
    private int contactSlot;
    private String courseType;
    private String resourceType;
    private String association;
    public Courses(String code,String name, int contactSlot,String courseType,String resourceType
                    ,String association){
        this.association=association;
        this.code=code;
        this.contactSlot=contactSlot;
        this.courseType=courseType;
        this.name=name;
        this.resourceType=resourceType;
    }
    
    public Courses(String code,String name, int contactSlot,String courseType,String resourceType){
        this.code=code;
        this.contactSlot=contactSlot;
        this.courseType=courseType;
        this.name=name;
        this.resourceType=resourceType;
    }
    
    public String getCode(){
        return code;
    }
    
    public String getName(){
        return name;
    }
    
    public int getContactSlot(){
        return contactSlot;
    }
    
    public String getCourseType(){
        return courseType;
    }
    
    public String getResourceType(){
        return resourceType;
    }
    
    public String getAssociation(){
        return association;
    }
}

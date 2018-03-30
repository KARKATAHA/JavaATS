/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amrish
 */
public class Instructors {
    private int id;
    private String Name;
    private String Expertise1;
    private String Expertise2;
    private String Expertise3;
    private String Expertise4;
    public Instructors(int id,String Name,String Expertise1,
                        String Expertise2,String Expertise3,
                        String Expertise4)
    {
        this.id=id;
        this.Name=Name;
        this.Expertise1=Expertise1;
        this.Expertise2=Expertise2;
        this.Expertise3=Expertise3;
        this.Expertise4=Expertise4;
    }
    public Instructors(int id,String Name,String Expertise1)
    {
        this.id=id;
        this.Name=Name;
        this.Expertise1=Expertise1;
    }
    
    public Instructors(int id,String Name,String Expertise1,
                        String Expertise2)
    {
        this.id=id;
        this.Name=Name;
        this.Expertise1=Expertise1;
        this.Expertise2=Expertise2;
    }
    
    public Instructors(int id,String Name,String Expertise1,
                        String Expertise2,String Expertise3)
    {
        this.id=id;
        this.Name=Name;
        this.Expertise1=Expertise1;
        this.Expertise2=Expertise2;
        this.Expertise3=Expertise3;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return Name;
    }
    public String getExpertise1(){
        return Expertise1;
    }
    public String getExpertise2(){
        return Expertise2;
    }
    public String getExpertise3(){
        return Expertise3;
    }
    public String getExpertise4(){
        return Expertise4;
    }
}

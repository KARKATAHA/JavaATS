/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amrish
 */
public class Rooms{
    private String Resource;
    private String  Type;
    private int Capacity;
    public Rooms(String Resource,String Type,int Capacity){
        this.Capacity=Capacity;
        this.Type=Type;
        this.Resource=Resource;
    }
    
    public String getResource(){
        return Resource;
    }
    
    public String getType(){
        return Type;
    }
    
    public int getCapacity(){
        return Capacity;
    }
}

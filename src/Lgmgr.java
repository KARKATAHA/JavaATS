import java.io.*;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amitabhsuman
 */
public class Lgmgr {
    public static int[][] PAT;
    public static int[] HAT;
    public static int[] LAT;
    public static void main(String[] args)
    {
        try{
           FileReader file = new FileReader("pat.txt");
           BufferedReader read = new BufferedReader(file);
            Scanner sc= new Scanner(read);
            String oneline = sc.nextLine();
            int i=0;
            while(oneline!= null){
                String[] number = oneline.split(",");
                    
                    for(int j=0;j<6;j++){
                    try{PAT[i][j]= Integer.parseInt(number[j]);
                    System.out.print(" "+PAT[i][j]);}
                    catch(NullPointerException npe){
                        
                    }
                    }
                i++;
                System.out.println();
                try{
                oneline = sc.nextLine();}
                catch(NoSuchElementException ne){
                   // System.out.println();
                    //System.out.print(ne);
                    break;
                }
            }
                sc.close();
            read.close();
            file.close();
        }
        catch(FileNotFoundException fe){
           System.out.println(fe);
        }
        catch(IOException e){
            System.out.print(e);
        }
         
         try
        {
           FileReader reade= new FileReader("hat.txt");
          BufferedReader buff = new BufferedReader(reade);
           String oneline;
           oneline =buff.readLine();
           int i=0;
           while(oneline!=null){
                HAT[i]=Integer.parseInt(oneline);
             i++;
               oneline = buff.readLine();
           }
           buff.close();
           reade.close();
        }
        
        catch(FileNotFoundException e)
                {
                    System.out.println(e);
                   // System.out.println("file not found");
                }
        catch(IOException e)
                {
                    System.out.println(e);
                }
         
         try
        {
           FileReader rea= new FileReader("lat.txt");
          BufferedReader buff = new BufferedReader(rea);
           String oneline;
           oneline =buff.readLine();
           int i=0;
           while(oneline!=null){
                LAT[i]=Integer.parseInt(oneline);
             i++;
               oneline = buff.readLine();
           }
           buff.close();
           rea.close();
        }
        
        catch(FileNotFoundException e)
                {
                    System.out.println(e);
                   // System.out.println("file not found");
                }
        catch(IOException e)
                {
                    System.out.println(e);
                }
        /*int LAT[]={3,6,3,6,3,6};
        int HAT[]={20,20,20,20,20,20};
        int PAT[][]={{6,5,3,2,0,0},{6,5,0,0,0,0},{1,2,0,0,0,0},{6,5,0,0,0,0},{5,4,0,0,0,0},{4,3,0,0,0,0}};*/
        char CYT[]={'T','L','T','L','T','L'};
        int CAT[][]=new int[6][6];
        int cn=6,tn=6;
        int tid,T[]=new int[6];
        int PQ[]=new int[6];
        for(int cid=0;cid<cn-1;cid++)
        {
            while(LAT[cid]>0)
            {
                for( tid=0;tid<tn;tid++)
                {
                    PQ[tid]=(PAT[tid][cid]*HAT[tid])/20;
                    T[tid]=tid;
                }
                
                for(int i=0;i<tn-1;i++)
                {
                    for(int j=i+1;j<tn;j++)
                    {
                        if(PQ[i]<PQ[j])
                        {
                            int t=PQ[i];
                            PQ[i]=PQ[j];
                            PQ[j]=t;
                            int x=T[i];
                            T[i]=T[j];
                            T[j]=x;
                        }
                    }
                }
               int x=0;
               for(int i=0;i<tn;i++)
               {
                   tid=T[i];
                   if(CYT[cid]=='T')
                   {for(int k=LAT[cid];k>0;k--){
                     if(HAT[tid]-k>0)
                     {
                         x=k;
                         break;
                     }
                   }
                   }
                   else
                   {
                       if(HAT[tid]-3>=0)
                       {
                           x=3;
                       }
                      
                   }
                   if(x>0)
                   {
                       CAT[tid][cid]=CAT[tid][cid]+x;
                       HAT[tid]=HAT[tid]-x;
                       LAT[cid]=LAT[cid]-x;
                       break;
                   }
               }
               if(x==0)
               {
                   System.out.println("not possible.");
                   break;
               }
               
            }
        }
        for(int i=0;i<tn;i++)
        {
            for(int j=0;j<cn;j++)
            {
                System.out.print(" "+CAT[i][j]+" ");
            }
            System.out.println();
        }
    }
}

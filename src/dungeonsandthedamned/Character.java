/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonsandthedamned;

import java.util.Random;
import java.io.*;
import java.util.Scanner;

//import java.io.File
/**
 *
 * @author SpencerBucknam!
 */
public class Character {
    static int ID=0;
    int PID=0;
    int[] stats= new int[7];
    int Spercent;
    int gold,silver,copper,platnum;
    String name, inventory;
    public Character()
    {
        ID++;
        if(PID==0){PID=ID;}
        if(name==null){name = "Character"+ID;}
        rollStats();
    }
    //main funtions
      //generates stats
    private void rollStats()
    {
    Random roll = new Random();
     int rolltotal=0;
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<3;j++)
            {
            rolltotal += roll.nextInt(5)+1;
            } 
            stats[i]= rolltotal;
            rolltotal=0;
        }
        stats[6]= (stats[3]+stats[4])/2;
        if(stats[0]==18){Spercent=roll.nextInt(99)+1;}
    }
    //get funtions 
    public String getName()
    {
        return name;
    }
    public int getStr()
    {
        return stats[0];
    }
    public int getDex()
    {
        return stats[1];
    }
    public int getCon()
    {
        return stats[2];
    }
    public int getInt()
    {
        return stats[3];
    }
    public int getWis()
    {
        return stats[4];
    }
    public int getChr()
    {
        return stats[5];
    }
    public int gerPer()
    {
        return stats[6];
    }
    public int getSpercent()
    {
        return Spercent;
    }
     public int getGold()
    {
        return gold;
    }
    public int getSilver()
    {
        return silver;
    }
    public int getCopper()
    {
        return copper;
    }
    public int getPlatnum()
    {
        return platnum;
    }
    public String getInventory()
    {
        return inventory;
    }
    //set funtions
    public void setName(String q)
    {
        name=q;
    }
    public void setStr(int q)
    {
        stats[0]=q;
    }
    public void setDex(int q)
    {
        stats[1]=q;
    }
    public void setCon(int q)
    {
        stats[2]=q;
    }
    public void setInt(int q)
    {
        stats[3]=q;
    }
    public void setWis(int q)
    {
        stats[4]=q;
    }
    public void setChr(int q)
    {
        stats[5]=q;
    }
    public void setSpercent(int q)
    {
        Spercent=q;
    }
    public void setGold(int q)
    {
        gold=q;
    }
    public void setSilver(int q)
    {
        silver=q;
    }
    public void setCopper(int q)
    {
        copper=q;
    }
    public void setPlatnum(int q)
    {
        platnum=q;
    }
    public void setInventory(String q)
    {
        inventory=q;
    }
    public void save()
    {
       try{ FileWriter write =new FileWriter("Character1.txt",true);
       write.write(name);
       write.write("\r\n");
       
       write.write(stats[0]);
       write.write("\r\n");
       
       write.write(stats[1]); 
       write.write("\r\n");
       
       write.write(stats[2]);      
       write.write("\r\n");
       
       write.write(stats[3]);
       write.write("\r\n");
       
       write.write(stats[4]);
       write.write("\r\n");
       
       write.write(stats[5]);
       write.write("\r\n");
       
       write.write(Spercent);
       write.write("\r\n");
       
       write.write(platnum);
       write.write("\r\n");
       
       write.write(gold);
       write.write("\r\n");
       
       write.write(silver);
       write.write("\r\n");
       
       write.write(copper);
       write.write("\r\n");
       
       write.write(inventory);
       write.write("\r\n");
       
       write.close();
       
       }
        catch(IOException e){}
        
    }
    public void Load()
    {
        //FileReader saves =new FileReader("Character1.txt");
       
    }
            
            
}

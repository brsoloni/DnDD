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
    String[] stats= new String[7];
    String gold,silver,copper,platnum,level,Spercent
            ,age,height,weight,race,Class,armor,name,inventory,sex,
            pick,open,traps,move,hide,detect,climb,read,shield;
    public Character()
    {
        
    }
    //get funtions 
    public String getName()
    {
        return name;
    }
    public String getStr()
    {
        return stats[0];
    }
    public String getDex()
    {
        return stats[1];
    }
    public String getCon()
    {
        return stats[2];
    }
    public String getInt()
    {
        return stats[3];
    }
    public String getWis()
    {
        return stats[4];
    }
    public String getChr()
    {
        return stats[5];
    }
    public String getPer()
    {
        return stats[6];
    }
    public String getSpercent()
    {
        return Spercent;
    }
     public String getGold()
    {
        return gold;
    }
    public String getSilver()
    {
        return silver;
    }
    public String getCopper()
    {
        return copper;
    }
    public String getPlatnum()
    {
        return platnum;
    }
    public String getLevel()
    {
        return level;
    }
    public String getAge()
    {
        return age;
    }
    public String getHeight()
    {
        return height;
    }
    public String getWeight()
    {
        return weight;
    }
    public String getRace()
    {
        return race;
    }
    public String getclass()
    {
        return Class;
    }
    public String getSex()
    {
        return sex;
    }
    public String getArmor()
    {
        return armor;
    }
    public String getShield()
    {
        return shield;
    }
    public String getPick()
    {
        return pick;
    }
    public String getOpen()
    {
        return open;
    }
    public String getTraps()
    {
        return traps;
    }
    public String getMove()
    {
        return move;
    }
    public String getHide()
    {
        return hide;
    }
    public String getDetect()
    {
        return detect;
    }
    public String getClimb()
    {
        return climb;
    }
    public String getRead()
    {
        return read;
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
    public void setStr(String q)
    {
        stats[0]=q;
    }
    public void setDex(String q)
    {
        stats[1]=q;
    }
    public void setCon(String q)
    {
        stats[2]=q;
    }
    public void setInt(String q)
    {
        stats[3]=q;
    }
    public void setWis(String q)
    {
        stats[4]=q;
    }
    public void setChr(String q)
    {
        stats[5]=q;
    }
    public void setPer(String q)
    {
        stats[6]=q;
    }
    public void setSpercent(String q)
    {
        Spercent=q;
    }
    public void setGold(String q)
    {
        gold=q;
    }
    public void setSilver(String q)
    {
        silver=q;
    }
    public void setCopper(String q)
    {
        copper=q;
    }
    public void setPlatnum(String q)
    {
        platnum=q;
    }
    public void setLevel(String q)
    {
        level = q;
    }
    public void setAge(String q)
    {
        age = q;
    }
    public void setHeight(String q)
    {
        height = q;
    }
    public void setWeight(String q)
    {
        weight = q;
    }
    public void setRace(String q)
    {
        race = q;
    }
    public void setclass(String q)
    {
        Class = q;
    }
    public void setArmor(String q)
    {
        armor = q;
    }
    public void setShield(String q)
    {
        shield =q;
    }
            
    public void setSex(String q)
    {
        sex=q;
    }
    public void setPick(String q)
    {
        pick = q;
    }
    public void setOpen(String q)
    {
        open = q;
    }
    public void setTraps(String q)
    {
        traps = q;
    }
    public void setMove(String q)
    {
        move = q;
    }
    public void setHide(String q)
    {
        hide = q;
    }
    public void setDetect(String q)
    {
        detect = q;
    }
    public void setClimb(String q)
    {
        climb = q;
    }
    public void setRead(String q)
    {
        read=q;
    }
    public void setInventory(String q)
    {
        inventory=q;
    }
    public void save(int x)
    {
       String txt="Character1.txt";
       if(x==1){txt="Character1.txt";}
       else if(x==2){txt="Character2.txt";}
       else if(x==3){txt="Character3.txt";}
       else if(x==4){txt="Character4.txt";}
       else if(x==5){txt="Character5.txt";}
       else if(x==6){txt="Character6.txt";}
       else if(x==7){txt="Character7.txt";}
       else if(x==8){txt="Character8.txt";}
       else if(x==9){txt="Character9.txt";}
       else if(x==10){txt="Character10.txt";}
       whipe(x);//to clear file before writing over it 
       try{ FileWriter write =new FileWriter(txt,true);
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
       
       write.write(stats[6]);
       write.write("\r\n");
     //  write.write(Spercent);
     //  write.write("\r\n");
       
       write.write(platnum);
       write.write("\r\n");
       
       write.write(gold);
       write.write("\r\n");
       
       write.write(silver);
       write.write("\r\n");
       
       write.write(copper);
       write.write("\r\n");
       
       write.write(level);
       write.write("\r\n");
       
       write.write(age);
       write.write("\r\n");
               
       write.write(height);
       write.write("\r\n");
       
       write.write(weight);
       write.write("\r\n");
       
       write.write(race);
       write.write("\r\n");
       
       write.write(Class);
       write.write("\r\n");
       
       write.write(sex);
       write.write("\r\n");
       
       write.write(armor);
       write.write("\r\n");
       
       write.write(shield);
       write.write("\r\n");
       
       write.write(pick);
       write.write("\r\n");
       
       write.write(open);
       write.write("\r\n");
       
       write.write(traps);
       write.write("\r\n");
               
       write.write(move);
       write.write("\r\n");
       
       write.write(hide);
       write.write("\r\n");
       
       write.write(detect);
       write.write("\r\n");
       
       write.write(climb);
       write.write("\r\n");
       
       write.write(read);
       write.write("\r\n");

       write.write(inventory);
       write.write("\r\n");
       
       write.close();
       
       }
        catch(IOException e){}
        
    }
    public void Load(int x)
    {
        try
        {
       String txt="Character1.txt";
       if(x==1){txt="Character1.txt";}
       else if(x==2){txt="Character2.txt";}
       else if(x==3){txt="Character3.txt";}
       else if(x==4){txt="Character4.txt";}
       else if(x==5){txt="Character5.txt";}
       else if(x==6){txt="Character6.txt";}
       else if(x==7){txt="Character7.txt";}
       else if(x==8){txt="Character8.txt";}
       else if(x==9){txt="Character9.txt";}
       else if(x==10){txt="Character10.txt";}
            FileReader saves =new FileReader(txt);
            BufferedReader buff = new BufferedReader(saves);
            name = buff.readLine();
            stats[0] = buff.readLine();
            stats[1] = buff.readLine();
            stats[2] = buff.readLine();
            stats[3] = buff.readLine();
            stats[4] = buff.readLine();
            stats[5] = buff.readLine();
            stats[6] = buff.readLine();
          //  Spercent = buff.readLine();
            platnum  = buff.readLine();
            gold  = buff.readLine();
            silver  = buff.readLine();
            copper  = buff.readLine();
            level  = buff.readLine();
            age  = buff.readLine();
            height  = buff.readLine();
            weight  = buff.readLine();
            race  = buff.readLine();
            Class  = buff.readLine();
            sex = buff.readLine();
            armor  = buff.readLine();
            shield  = buff.readLine();
            pick  = buff.readLine();
            open  = buff.readLine();
            traps  = buff.readLine();
            move  = buff.readLine();
            hide  = buff.readLine();
            detect  = buff.readLine();
            climb  = buff.readLine();
            read = buff.readLine();
            inventory  = buff.readLine();
            saves.close();
            buff.close();
        }
        
        catch(IOException e){}
       
    }
    public void whipe(int x)
    {
        try
        {
            String txt="Character1.txt";
            if(x==1){txt="Character1.txt";}
            else if(x==2){txt="Character2.txt";}
            else if(x==3){txt="Character3.txt";}
            else if(x==4){txt="Character4.txt";}
            else if(x==5){txt="Character5.txt";}
            else if(x==6){txt="Character6.txt";}
            else if(x==7){txt="Character7.txt";}
            else if(x==8){txt="Character8.txt";}
            else if(x==9){txt="Character9.txt";}
            else if(x==10){txt="Character10.txt";}
            FileWriter gone = new FileWriter(txt, false); 
            PrintWriter whipeall = new PrintWriter(gone, false);
            whipeall.flush();
            gone.close();
            whipeall.close();
        }
        catch(IOException e){}  
        
    }
            
            
}

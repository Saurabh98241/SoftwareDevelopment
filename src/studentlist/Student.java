package studentlist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaim
 */
public class Student {
    private String name;
    private int ID;
    private String DoB;
   
    public Student()
    {
        name = "Name Not Set";
        ID = 0;
    }
    public Student(String givenName, int givenID)
    {
          this.name = givenName;
          this.ID = givenID;
    }
    // set value to name
    public void setName(String givenName)
    {
       this.name = givenName;
    }
    
    public String getName()
    {
           return name;
    }
    
    public void setID (int givenID)
    {
        this.ID = givenID;
    }
    
    public int getID ()
    {   
        return ID;
    }

   
    public String getDoB() {
        return DoB;
    }

   
    public void setDoB(String DoB) {
        this.DoB = DoB;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doghouse;

/**
 *
 * @author 1101923
 */
public class Dog 
{
    private int numTimesFed = 0;
    private boolean sleeping = false;
    private String name = "Lucas";
    
    public String getName()
    {
        return name;
    } 
    public void wakeUp()
    {
        System.out.println("WAKING UP");
        this.sleeping = false;
        this.numTimesFed = 0;
    }
    public void sleep()
    {
        this.sleeping = true;
        System.out.println("SLEEPING");
    }
    public void hear(String sound)
    {
    if (this.sleeping = true)
    return;
        
        if(sound.equals(name))
        {
        System.out.println("WAG TAIL");
        }
        if(sound.equals("ding-dong"))
        {
            System.out.println("BARK");
        }
        else{
            return;
        }
    }
    public void feed()
    {
      if(this.sleeping = true) 
         return; 
      numTimesFed++;
      if(numTimesFed > 2)
      {
          System.out.println("Yawn");
      }
      else
      {
          System.out.println("YUMMY");
      }
      
      
    }               
}

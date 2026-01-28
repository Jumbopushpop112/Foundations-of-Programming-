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
public class House {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Dog myDog = new Dog();
       String name = myDog.getName();
       System.out.println("A day in the life of my dog " + name);
       myDog.wakeUp();
       myDog.sleep();
       myDog.wakeUp();
       myDog.feed();
       myDog.hear("ding-dong"); 
       myDog.hear("ding-dong");
       myDog.hear(name);
       myDog.hear("ding-dong");
       myDog.hear("ding-dong");
       myDog.feed();
       myDog.feed();

// test to ensure the dog doesn't do anything while asleep 
      System.out.println("\nNight-time..."); 
      myDog.sleep();
      myDog.feed();
      myDog.hear("ding-dong");
      myDog.wakeUp();
    }
    
}

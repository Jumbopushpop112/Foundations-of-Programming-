/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.statements.ex21.to.ex28;

import java.util.Scanner;

/**
 *
 * @author 1101923
 */
public class Ex33_My_Short_Adventure_Story {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner Keyboard = new Scanner (System.in);
       String usersChoice = "";
       System.out.println("In Manhattan you see a whitevan and an alleyway Which do you choose?(Enter \"Whitevan\" or \"Alley way\")");
       usersChoice = Keyboard.nextLine();
       if (usersChoice.equalsIgnoreCase("Whitevan"))
       {
            System.out.println("In the van you get free candy or free WiFi Which do you choose?(Enter \"Free Candy\" or \"Free WiFi");
            usersChoice = Keyboard.nextLine();
            if (usersChoice.equalsIgnoreCase("Free candy"))
            {
                System.out.println ("Having free candy you're going to possibly get razorbladed or fat Which do you choose?(Enter \"razor blade\" or \"fat\")");
                usersChoice = Keyboard.nextLine();
                if (usersChoice.equalsIgnoreCase("razor blade"))
                    System.out.println("Your mouth is cut up");
                else 
                
                    System.out.println("You are fat");
                      
            }
            else
            {
                usersChoice = Keyboard.nextLine();
                if (usersChoice.equalsIgnoreCase("Become a twitch streamer"))
                    System.out.println("You get 5 million dollars");
                else
                {
                    System.out.println("You got a small salary playing games, because it seems your not good at Fortnite, Roblox, or Minecraft!");
                }
            }
        }
       else
       {
            System.out.println("In the alleyway you get free chocolate or free legos  Which do you choose?(Enter \"Free chocolate\" or \"Free legos");
            usersChoice = Keyboard.nextLine();
            if (usersChoice.equalsIgnoreCase("Free chocolate"))
            {
                System.out.println ("Having free chocolate you're going to possibly get possesed or sick Which do you choose?(Enter \"possesed\" or \"getsick\")");
                usersChoice = Keyboard.nextLine();
                if (usersChoice.equalsIgnoreCase("possesed"))
                    System.out.println("Your mind is taken by an alien who sucks you blood out and sends you to another world where no one else exists but you!");
                else                 
                    System.out.println("You are sick");                     
            }
            else
            {
                System.out.println ("Having free legos you're going to possibly going to become a pro youtuber or get no subscribers at all  Which do you choose?(Enter \"Become a pro youtuber\" or get no subscribers at all \"\")");
                usersChoice = Keyboard.nextLine();
                if (usersChoice.equalsIgnoreCase("Become a pro youtuber"))
                    System.out.println("You get a subscribers plaque");
                else                
                    System.out.println("You get nothing at all, your channel only has 5 subscribers! make more Roblox Videos!");
                
            }
       }
    }
}  
            
            
            
              
       
       



import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1101923
 */
public class Ex54_Limited_Tries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         Scanner keyboard = new Scanner (System.in);
         System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses.");
         System.out.println("Enter your guess");
         int userguess = keyboard.nextInt();
         int guesschoice = 7;
         int randomnum = (int)(Math.floor(Math.random()*101));
         int n = userguess;
               while (n != randomnum && guesschoice > 0)  
              {
                   
                   System.out.println("\n That is an incorrect number, you have " + guesschoice + " tries left");
                   System.out.println(" Enter your guess for my number");
                   n = keyboard.nextInt();
                   guesschoice--;
                   if (randomnum > userguess)
                   {
                       System.out.println("Your number is too low");
                   }
                   if (randomnum < userguess)
                   {
                          System.out.println("Your number is too high"); 
                   } 
                   if (userguess == randomnum)
                   System.out.println("\n Number accepted, you win!");
                  
                     
                   
                    
             }
               
               System.out.println("Looks like you used up your tries and couldn't guess my number. You lose");
                  
         
       
       }
    
}

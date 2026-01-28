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
public class Ex35_Two_More_Questions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("Does it live inside, outside or both?");
        String userInput1 = keyboard.nextLine(); 
        
        System.out.println("Is it a living thing?");
        String userInput2 = keyboard.nextLine();
        
        if (userInput1.equalsIgnoreCase("inside") && userInput2.equalsIgnoreCase("alive"))
           System.out.println("Your pet is a houseplant");
        
        if (userInput1.equalsIgnoreCase("inside") && userInput2.equalsIgnoreCase("not alive"))
             System.out.println("Your pet is a shower curtain");
        
        if (userInput1.equalsIgnoreCase("outside") && userInput2.equalsIgnoreCase("alive"))
             System.out.println("Your pet is a bison");
        
        if (userInput1.equalsIgnoreCase("outside") && userInput2.equalsIgnoreCase(" not alive"))
             System.out.println("Your pet is a billboard");
        
        if (userInput1.equalsIgnoreCase("both") && userInput2.equalsIgnoreCase("alive"))
             System.out.println("Your pet is a dog");
        
        if (userInput1.equalsIgnoreCase("both") && userInput2.equalsIgnoreCase(" not alive"))
             System.out.println("Your pet is a cell phone");
       
          
        
    }  
    
}    


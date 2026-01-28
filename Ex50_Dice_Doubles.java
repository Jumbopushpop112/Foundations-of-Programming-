


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1101923
 */
public class Ex50_Dice_Doubles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int die1 = 1 +(int)(Math.random()*6);
        int die2 = 1 +(int)(Math.random()*6);
        
        
        System.out.println("You must get doubles by rolling the dice. You will have to roll until you get doubles");
        
        while (die1 != die2)
        {
            System.out.println("\nyou rolled a:" + 1+(die1));
            die1 = 1 +(int)(Math.random()*6);
            System.out.println("\nyou rolled a:" + 1+(die2));
            die2 = 1 +(int)(Math.random()*6);
            int total = die1 + die2;
            System.out.println("Looks like you have to get doubles. Your total was: " + total);
            
            
        }
        System.out.println("You got doubles, yay!");
        
        
        
        
        
        
       
    }
    
}

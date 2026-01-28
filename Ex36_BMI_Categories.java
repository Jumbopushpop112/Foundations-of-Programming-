/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.statements.ex21.to.ex28;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 1101923
 */
public class Ex36_BMI_Categories {

    /**
     * @param args the command line 6arguments
     */
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner (System.in);
        double usersweight = 0.0;
        System.out.println("Enter your weight in pounds");
        
        
        if (keyboard.hasNextDouble())
            usersweight = keyboard.nextDouble();
        else //hasNextDouble retured false
        {
            System.out.println("You did not enter a number, program will now exit");
            System.exit(-1);
        }
        //convert pounds to killograms
        usersweight = usersweight/2.205;
        
        System.out.println("Enter your height in feet and inches (Example 5 ft 11 inches would be 5 11)");
        int usersfeet = keyboard.nextInt();
        System.out.println("Users feet is " + usersfeet);
        int usersinches = keyboard.nextInt();
        System.out.println("Users inches is " + usersinches);
        double meters = (usersfeet * 0.3048) + (usersinches * 0.0254);
        double meterssquared = Math.pow(meters, 2);
        double userBMI = (usersweight/ meterssquared);
        
        
        
        
        if (userBMI < 18.5)
           System.out.println("You are underweight");
        if ((userBMI >= 18.5) && (userBMI <= 24.9))
           System.out.println("You have normal weight");
        if ((userBMI >= 25.0) && (userBMI <= 29.9))
           System.out.println("You are overweight");
        if (userBMI >= 30.0) 
           System.out.println("You are obese");
        
        System.out.println("Your BMI is " + userBMI);
           
           
      
        
        
        
      
        
        
                
        
        
    }
}
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi.categories.using.oop;

/**
 *
 * @author 1101923
 */
public class Tester_BMI_Categories {

    /** Accesor that will hold info in which user can enter first name, last name and it will display what was entered and BMI category will be displayed
     * @param args the command line arguments
     */
    public static void main(String[] args)     
    {
        Acquisitioner myAcquirer = new Acquisitioner();
        String firstName = myAcquirer.getAlphaFromUser("Enter your first name"); 
        String lastName = myAcquirer.getAlphaFromUser("Enter your last name");
        double heightFt = myAcquirer.getAndValidateDoubleViaScanner("Enter your height in feet only");
        double heightInches = myAcquirer.getAndValidateDoubleViaScanner("Any added inches after feet was entered");
        double weightPounds = myAcquirer.getAndValidateDoubleViaScanner("Enter your weight in pounds");
        
        Person P1 = new Person( firstName, lastName, heightFt, heightInches, weightPounds ); 
        System.out.printf("First person's name user entered is: %s\n" , P1.getFirstName());
        System.out.printf("BMI category of P1 is " + P1.classifyBMI() + "\n");
        
         firstName = myAcquirer.getAlphaFromUser("Enter your first name\n");
         lastName = myAcquirer.getAlphaFromUser("Enter your last name");
         heightFt = myAcquirer.getAndValidateDoubleViaScanner("Enter your height in feet only");
         heightInches = myAcquirer.getAndValidateDoubleViaScanner("Any added inches after feet was entered");
         weightPounds = myAcquirer.getAndValidateDoubleViaScanner("Enter your weight in pounds");
         
         Person P2 = new Person(firstName, lastName, heightFt, heightInches, weightPounds);
         System.out.printf("Second person's name user entered is: %s\n" , P2.getFirstName());
         System.out.printf("BMI category of P2 is " + P2.classifyBMI()); 
       
        
                

        
        
        
        

    }
    
}

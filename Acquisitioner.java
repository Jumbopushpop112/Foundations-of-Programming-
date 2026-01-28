/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.involvingarraylist;


import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author 1101923
 */
public class Acquisitioner  
{
    Class Acquisitioner;

    Scanner usersInput;
    //empty arg constructor
    public Acquisitioner(){
        usersInput = new Scanner(System.in);
    }
    
    /**
     * Get input from user using Scanner class
     * Validating if input is a number only
     * @param prompt Directions to display to user
     * @return users number. (-1 if unsuccessful getting a valid number)
     */
    public double getAndValidateDoubleViaScanner(String prompt) {
        double num;
        boolean validNum = false;
        
        System.out.println(prompt);
        while (validNum == false)
        {
            try
            {
                num = usersInput.nextDouble();
                usersInput.nextLine();
                validNum = true;
                return num;
            }
            catch(InputMismatchException e)  
            {
                //JOptionPane.showMessageDialog(null, "Invalid data: Please enter a number");
                //Keep asking for a number until one is entered    
                System.out.println("Invalid data: Please enter a number");
                //consume new line character produced by hitting the enter key
                usersInput.nextLine();
            }
            catch(NoSuchElementException e) {
                JOptionPane.showMessageDialog(null, "Entered catch NoSuchElementException");
            }
        }//end while
        
        //Method failed to produce a valid number
        return -1;
		
    }//end method
    
    /**
     * Get input from user using JOptionPane.showInputDialog
     * Validating if input is a number only
     * @param prompt Directions to display to user
     * @return users number
     */
    public int getAndValidateIntegerViaInputBox(String prompt)
    {
        //Valildating userinput (one way)
        String strUsersInput; 
        int intUsersInput = 0;
        boolean flag = false;
        while (flag==false)
        {
            strUsersInput = JOptionPane.showInputDialog(prompt);
            try
            {
                intUsersInput = Integer.parseInt(strUsersInput);
                flag = true;
            }
            catch(NumberFormatException e)
            {
                strUsersInput = JOptionPane.showInputDialog(strUsersInput + " is not a number, Enter a number");
            }
        }//end while
        //System.out.println("Exited the while loop Now have valid number which is: " + intUsersInput);
        JOptionPane.showMessageDialog(null, "Exited the while loop we now have valid number which is: " + intUsersInput);
        return intUsersInput;

    }//End method getAndValidateViaInputBox

    /**
     * 
     * @param prompt
     * @return * Validating users input is numbers only using the 'matches' method of String class
     * @param prompt Directions to display to user
     * @return number entered by user.  Return -1 if unsuccessful getting a valid word
     */
    public int getAndValidateViaMatchesMethod(String prompt) { 

        // As per Java regular expressions, the  + means "one or more times" and \d means "a digit".
        String regex = "\\d+"; 
        String num;
        boolean validNum = false;

        //Ask for a number
        System.out.println(prompt);

        while (validNum == false)
        {
            try
            {					
                num = usersInput.nextLine();
                if (num.matches(regex))
                {
                    validNum = true;
                    return Integer.parseInt(num);
                }					
                else
                    throw new InputMismatchException();
            }
            catch(InputMismatchException e)
            {
                //JOptionPane.showMessageDialog(null, "Invalid data: Please enter a number");
                System.out.println("Matches method says Invalid data: Please enter a number");
            }
            catch(NumberFormatException e)
            {
                System.out.println("Matches method says number too big for int: Please enter a smaller number");
                validNum=false;
            }
        }//end while

        return -1; //unsuccessful generating a valid number

    }//end method getAndValidateViaMatchesMethod

    /**
     * Validating users input is letters only using the 'matches' method of String class
     * @param prompt Directions to display to user
     * @return word entered by user.  Empty string if unsuccessful getting a valid word
     */
    public String getAlphaFromUser(String prompt)
    {
        String word = "";
        boolean validWord = false;
        //Ask for a string
        System.out.println(prompt);
        
        while (validWord==false)
        {
            try
            {
                word = usersInput.nextLine();
                // As per Java regular expressions, the "[a-zA-z]+" means "only letters".
                //the + means "one or more characters"  
                if (word.matches("[a-zA-Z]+")){
                    validWord=true;
                    return word;
                }
                else 
                    throw new InputMismatchException();           
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid data: " + prompt);
            }
        }
        return ""; //unsuccessful generating a vaild word 
    }
    
}//end class





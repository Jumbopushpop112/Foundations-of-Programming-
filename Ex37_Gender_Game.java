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
public class Ex37_Gender_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner keyBoard = new Scanner (System.in);
        String firstName = "";
        String lastName = "";
        String Gender = "";
        String Married = "";
        int age = 0;
     
        System.out.println("What is your gender (M or F): ");
        if (keyBoard.hasNext())
            Gender = keyBoard.next();
        if ((Gender.equalsIgnoreCase("M") || Gender.equalsIgnoreCase("F")) == false)
        {
            System.out.println("Invalid gender. Program will now terminate");
            System.exit(-1);
        }
                
        System.out.println("First name: ");
        if (keyBoard.hasNext())
            firstName = keyBoard.next();
        
        System.out.println("Last name: ");
        if (keyBoard.hasNext())
            lastName = keyBoard.next();
        
        System.out.println("Age: ");
        if (keyBoard.hasNextInt())
            age = keyBoard.nextInt();
        else
        {
            System.out.println("Invalid age, program will now terminate");
            System.exit(-1);
        }
               
        if (age >= 20 && Gender.equalsIgnoreCase("F"))
        {
            System.out.println("\nAre you married, " + firstName + " (y or n)? ");
            if (keyBoard.hasNext())
                Married = keyBoard.next();
            if ((Married.equalsIgnoreCase("Y") || Married.equalsIgnoreCase("N")) == false)
            {
                System.out.println("Invalid marriage status, program will now terminate");
                System.exit(-1);
            }
        }
        
        if (age >= 20 && Gender.equalsIgnoreCase("F") && Married.equalsIgnoreCase("Y"))
            System.out.println("\nThen I shall call you Mrs. " + firstName + " " + lastName + ".");
        if (age >= 20 && Gender.equalsIgnoreCase("F") && Married.equalsIgnoreCase("N"))
            System.out.println("\nThen I shall call you Ms. " + firstName + " " + lastName + ".");
        if (age < 20 && Gender.equalsIgnoreCase("F"))
            System.out.println("\nThen I shall call you " + firstName + " " + lastName + ".");
        
        if (age >= 20 && Gender.equalsIgnoreCase("M"))
            System.out.println("\nThen I shall call you Mr. " + firstName + " " + lastName + ".");
        if (age < 20 && Gender.equalsIgnoreCase("M"))
            System.out.println("\nThen I shall call you " + firstName + " " + lastName + ".");
    }
}       


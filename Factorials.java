/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chp7lsn4_work_with_me;

import java.util.Scanner;

/**
 *
 * @author 1101923
 */
public class Factorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         Scanner keyBoard = new Scanner(System.in);
        int number = 0;
       
        System.out.println("Please enter an integer:");
       
        if (keyBoard.hasNextInt() == false)
        {
            System.out.print("Oops! Try again, please enter an integer.");
            keyBoard.close();
            return; 
        }
        number = keyBoard.nextInt();
     
        long factorial = 1;
        for (int i = 1; i <= number; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("for loop: " + number + "! is " + factorial);
        
        factorial = 1;
        int j = 1;
        while (j <= number)
        {
            factorial = factorial * j;
            j++;
        }
        System.out.println("while loop: " + number + "! is " + factorial);
        
        factorial = 1;
        int k = 1;
        do {
             factorial = factorial * k;
             k++;
        } while (k <= number);
        System.out.println("do-while loop: " + number + "! is " + factorial);
        
        keyBoard.close();

            
    
    
                   
                  
           
           
           
       
       }
    }

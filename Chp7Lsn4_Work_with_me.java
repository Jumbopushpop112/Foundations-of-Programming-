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
public class Chp7Lsn4_Work_with_me {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         int number = 0;
      int answer = 0;

      System.out.print("Enter a multiplication number: ");
      Scanner input = new Scanner(System.in);
      number = input.nextInt();

      // Use a loop variable named "j", make it start at 1 and increase by 1 
	  // each time through the loop, stopping before it hits 11.
      for (int j=1; j<11; j++)
      {
         answer = number * j;
         System.out.println(j + " x " + number + " = " + answer);
      }

      input.close();
              
    }
}  
   
    
    
        
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisesinvolvingfunctions;

import java.util.Random;

/**
 *
 * @author 1101923
 */
public class Ex98_FlickerPhrase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {//this code will flash I pledge allegaince to the flag
       Random rng = new Random();
		int r;
		
		for ( int i=0; i<100000; i++ )
		{
			r = 1 + rng.nextInt(5);
			// Write five if statements here.
			// If r is 1, then call the function named 'first'.
			// If r is 2, then call the function named 'second', and so on.
			

			// Optional: after the if statements are over, add in a slight delay.
		}

		System.out.println("I pledge allegiance to the flag.");
		
	}//these are the print statements that will put a space each time

	public static void first()
	{
		System.out.print("I                               \r");
	}

	public static void second()
	{
		System.out.print("  pledge                        \r");
	}

	public static void third()
	{
		System.out.print("         allegiance             \r");
	}

	public static void fourth()
	{
		System.out.print("                    to the      \r");
	}

	public static void fifth()
	{
		System.out.print("                           flag.\r");
	}
}    
    
    


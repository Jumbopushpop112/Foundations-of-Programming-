
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
public class Ex49_Keep_Guessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
		int number = 5;

		System.out.println("I  have chosen a number between 1 and 10, try to guess it?");
		System.out.print("Enter your number: ");
		int entry = keyboard.nextInt();

		while ( entry != number )
		{
			System.out.println("\nIncorrect number file runner. Please try again to guess it.");
			System.out.print("Enter your number: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nNumber accepted. Congragulations you guessed my number! Give yourself a pat on the back.");
	}
}
    
    


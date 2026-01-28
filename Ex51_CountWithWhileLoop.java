
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
public class Ex51_CountWithWhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it 3 times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();

		int n = 10;
		while ( n > 10  )
		{
			System.out.println( (n+1) + ". " + message );
			n= 2;
		}

	}
}
        
    
    


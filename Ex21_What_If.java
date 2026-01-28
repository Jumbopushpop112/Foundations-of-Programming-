/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1101923
 */
public class Ex21_What_If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        What do you think the if does to the code under it? Put your answer in a comment in the code.
        answer:  If the condition in ()'s results to true the code in the culry braces will execute
        What is the purpose of the curly braces in the if statement? Answer in a comment.
        To partition off the block of code to execute if the condition evaluates to true
        Change the values of the variables so that neither message about cats is printed.
        
        */
        int people = 20;
		int cats = 20;
		int dogs = 15;

		if ( people < cats )
		{
			System.out.println( "Too many cats!  The world is doomed!" );
		}

		if ( people > cats )
		{
			System.out.println( "Not many cats!  The world is saved!" );
		}

		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}

		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}

		dogs += 5;

		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
        
        // TODO code application logic here
    }
    
}

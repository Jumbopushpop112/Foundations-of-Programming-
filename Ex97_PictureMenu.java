/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisesinvolvingfunctions;

import java.util.Scanner;



/**
 *
 * @author 1101923
 */
public class Ex97_PictureMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
		int choice;
                int t = 1;
		
		System.out.println( "1. Butterfly " );
		System.out.println( "2. Elephant  " );
		System.out.println( "3. Teddy Bear" );
		System.out.println( "4. Snake     " );
		
		System.out.print( "\nWhich animal to draw? " );
		choice = kb.nextInt();
		System.out.println();
		
                //these statements check to see what the user entered, and all the possible outputs
		if ( choice == 1 )
		{
                    
		       butterfly();
                       butterfly();
		}
                
		else if ( choice == 2 )
		{
                  //this loop will display elephant 5 times
                  for (int e = 1; e <=5; e++)
                    {
                        //this line will call elephant
			 elephant();
                    }   
                    
                         
		}
		else if ( choice == 3 )
		{
                    //this loop will display teddybear 5 times
                  while (t <= 5)
                  {// the items in this area will increment t by 1 and close teddybear
                         t++;
			 teddybear();
		  }
                }
		else if ( choice == 4 )
		{
                        //this loop will display snake 5 times
                    do{
                        snake();
                        t++;
                    }while (t <= 5);
                       
                    
			
		}
		else 
		{
			System.out.println( "Sorry, that wasn't one of the choices." );
		}

		System.out.println( "\nGoodbye!" );
	}
	
	public static void butterfly()
	{//this is the display for choice 1
		System.out.println("  .==-.                   .-==.     ");
		System.out.println("   \\()8`-._  `.   .'  _.-'8()/     ");
		System.out.println("   (88\"   ::.  \\./  .::   \"88)     ");
		System.out.println("    \\_.'`-::::.(#).::::-'`._/      ");
		System.out.println("      `._... .q(_)p. ..._.'         ");
		System.out.println("        \"\"-..-'|=|`-..-\"\"       ");
		System.out.println("        .\"\"' .'|=|`. `\"\".       ");
		System.out.println("      ,':8(o)./|=|\\.(o)8:`.        ");
		System.out.println("     (O :8 ::/ \\_/ \\:: 8: O)      ");
		System.out.println("      \\O `::/       \\::' O/       ");
		System.out.println("       \"\"--'         `--\"\"   hjw");
	}
	
	public static void elephant()
	{// this is the display for choice 2
		System.out.println("       _..--\"\"-.                  .-\"\"--.._ ");
		System.out.println("   _.-'         \\ __...----...__ /         '-._");
		System.out.println(" .'      .:::...,'              ',...:::.      '.");
		System.out.println("(     .'``'''::;                  ;::'''``'.     )");
		System.out.println(" \\             '-)              (-'             /");
		System.out.println("  \\             /                \\             /");
		System.out.println("   \\          .'.-.            .-.'.          /");
		System.out.println("    \\         | \\0|            |0/ |         /");
		System.out.println("    |          \\  |   .-==-.   |  /          |");
		System.out.println("     \\          `/`;          ;`\\`          /");
		System.out.println("      '.._      (_ |  .-==-.  | _)      _..'");
		System.out.println("          `\"`\"-`/ `/'        '\\` \\`-\"`\"`");
		System.out.println("               / /`;   .==.   ;`\\ \\");
		System.out.println("         .---./_/   \\  .==.  /   \\ \\");
		System.out.println("        / '.    `-.__)       |    `\"");
		System.out.println("       | =(`-.        '==.   ;");
		System.out.println(" jgs    \\  '. `-.           /");
		System.out.println("         \\_:_)   `\"--.....-'");
	}
	
	public static void teddybear()
	{//this is the display for choice 3
		System.out.println("            ___   .--. ");
		System.out.println("      .--.-\"   \"-' .- |");
		System.out.println("     / .-,`          .'");
		System.out.println("     \\   `           \\");
		System.out.println("      '.            ! \\");
		System.out.println("        |     !  .--.  |");
		System.out.println("        \\        '--'  /.____");
		System.out.println("       /`-.     \\__,'.'      `\\");
		System.out.println("    __/   \\`-.____.-' `\\      /");
		System.out.println("    | `---`'-'._/-`     \\----'    _");
		System.out.println("    |,-'`  /             |    _.-' `\\");
		System.out.println("   .'     /              |--'`     / |");
		System.out.println("  /      /\\              `         | |");
		System.out.println("  |   .\\/  \\      .--. __          \\ |");
		System.out.println("   '-'      '._       /  `\\         /");
		System.out.println("      jgs      `\\    '     |------'`");
		System.out.println("                 \\  |      |");
		System.out.println("                  \\        /");
		System.out.println("                   '._  _.'");
		System.out.println("                      ``");
		
	}
	
	public static void snake()
	{//this is the display for choice 4
		System.out.println("         ,,'6''-,.");
		System.out.println("        <====,.;;--.");
		System.out.println("        _`---===. \"\"\"==__");
		System.out.println("      //\"\"@@-\\===\\@@@@ \"\"\\\\");
		System.out.println("     |( @@@  |===|  @@@  ||");
		System.out.println("      \\\\ @@   |===|  @@  //");
		System.out.println("        \\\\ @@ |===|@@@ //");
		System.out.println("         \\\\  |===|  //");
		System.out.println("___________\\\\|===| //_____,----\"\"\"\"\"\"\"\"\"\"-----,_");
		System.out.println("  \"\"\"\"---,__`\\===`/ _________,---------,____    `,");
		System.out.println("             |==||                           `\\   \\");
		System.out.println("            |==| |          pb                 )   |");
		System.out.println("           |==| |       _____         ______,--'   '");
		System.out.println("           |=|  `----\"\"\"     `\"\"\"\"\"\"\"\"         _,-'");
		System.out.println("            `=\\     __,---\"\"\"-------------\"\"\"''");
		System.out.println("                \"\"\"\"		");
	}
}
    
    


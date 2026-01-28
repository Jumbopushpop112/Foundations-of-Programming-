
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Matthew
 */
public class Ex55_Adding_Loops_Second_way {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner keyBoard = new Scanner (System.in);
        int usernum = 0;
        double runsum = 0.0;
        int numcount = 0;
        double average = 0.0;
        
        System.out.println("Enter your all your numbers on one line. 0 to quit");
        if (keyBoard.hasNext())
            usernum = keyBoard.nextInt();
        
        while (usernum != 0)
        {
            runsum = runsum + usernum;
            numcount = numcount + 1;
            if (keyBoard.hasNext())
                usernum = keyBoard.nextInt();
        }
        System.out.println("The sum of your numbers is: " + runsum);
        average = Math.round((runsum / numcount) * 100.0) / 100.0;
        System.out.println("The average of your number is: " + average);
        keyBoard.close();
    }
    
}

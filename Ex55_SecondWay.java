
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
public class Ex55_SecondWay {

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
      
        System.out.println("Enter your numbers all on one line, separate them by a space please. 0 to quit");
        if (keyBoard.hasNext())
            usernum = keyBoard.nextInt();
          
        while (usernum != 0)
        {
            runsum = runsum + usernum;
            numcount = numcount + 1;
            if (keyBoard.hasNext())
                usernum = keyBoard.nextInt();   
        }
        average = Math.round((runsum / numcount) * 100.0) / 100.0;
        System.out.printf("The sum of the %1d numbers entered is: %2.2f",numcount, runsum);
        System.out.printf("With a sum of " + runsum + " and " + numcount + " numbers entered the average is " + average);
    }
    
}

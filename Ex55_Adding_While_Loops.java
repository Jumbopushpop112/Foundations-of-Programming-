/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Matthew
 */
public class Ex55_Adding_While_Loops {

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
      
        System.out.println("Enter a number. 0 to quit");
        if (keyBoard.hasNext())
            usernum = keyBoard.nextInt();
          
        while (usernum != 0)
        {
            runsum = runsum + usernum;
            numcount = numcount + 1;
            System.out.println("Enter a number. 0 to quit");
            if (keyBoard.hasNext())
                usernum = keyBoard.nextInt();   
        }
        average = Math.round((runsum / numcount) * 100.0) / 100.0;
        System.out.println("The sum of the " + numcount + " numbers entered is: " + runsum);
        System.out.println("With a sum of " + runsum + " and " + numcount + " numbers entered the average is " + average);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercises.involving.arrays;

import java.util.Scanner;

/**
 *
 * @author 1101923
 */
public class Ex146_IsIThere { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] myIntArray = new int [10];//declarations go here for the functions and the int array, as well as the boolean for if the number is there or not
        fillArray(myIntArray);
        displayArray(myIntArray);
        int getuserNum = getuserNum();
        boolean isThere = searchArray(myIntArray,getuserNum);
        displayresult(isThere, getuserNum);
        
        
    
        
        
       
        
    }
    public static void fillArray(int[] array)//function that fills array and generates random numbers using math.random
    {
         for (int i = 0; i < array.length; i++)
             array [i] = (int)(1+Math.random()*50);
    }
    public static void displayArray(int[]array)//function that will display the array in the print statement
    {
       for (int i = 0; i < array.length; i++)
       System.out.print(array[i] + " ");
    }
    public static int getuserNum()
    {// function that will get users number, it requires you to enter in a number and is supported by the scanner variable, it will return the number once it is entered
        Scanner keyBoard  = new Scanner (System.in);
        System.out.print("Enter a number please");
        int getUserNum = 0;
        if(keyBoard.hasNextInt())
        {
            getUserNum = keyBoard.nextInt(); 
        }
       return getUserNum;
    }
    public static boolean searchArray(int[] myArray, int userNum) //function that will search the array for the number the user entered
    {
        for (int i = 0; i < myArray.length; i++){
        if (myArray[i] == userNum)
        return true;
        
        }
        return false;
    }
    public static void displayresult( boolean isThere,  int userNum)//this function will display the results if the number was found, if not the statement will return as false
    {
       if (isThere = true)
       System.out.print(userNum + " was searched in the array, and it was there");
       else
       {
           System.out.print(userNum + " was searched in the array, and it wasn't there"); 
       }      
    }
}           
 
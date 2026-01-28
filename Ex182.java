/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.involvingarraylist;


import java.util.ArrayList;

/**
 *
 * @author 1101923
 */
public class Ex182 {

    /**Main function that has variable declaration and if statements to see if the target number was found or not, it also has a variable which displays output
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        
        fillList(myList);
        displayList(myList);
        
        Acquisitioner myAcquisitioner = new Acquisitioner();
        int userNum = myAcquisitioner.getAndValidateViaMatchesMethod("Enter a number to be searched");
        boolean isThere = searchList(myList, userNum);
        if(isThere == true)
        {
            System.out.printf("User's number %d  was found", userNum);
        }
        else
        {
            System.out.printf("User's number %d was not found", userNum);
        }
    }
    /**
     * Function that fills list using math.random to add random numbers
     * @param emptyList 
     */
    public static void fillList(ArrayList<Integer> emptyList)
    {
         for(int i = 0; i < 10; i++)
         {
           emptyList.add((int)(1 + Math.random() *50 ));  
         }
          
    }
    /**
     * Function that displays the list with 5 columns in each row
     * @param fullList 
     */
    public static void displayList(ArrayList<Integer> fullList )
    {
         for(Integer curNum: fullList)
        {
            System.out.printf("%-5d" , curNum);
        }
         System.out.println();
    }
    /**
     * function that searches list to see if the number was found, it either returns true of false
     * @param receivedList
     * @param targetNumber
     * @return 
     */
    public static boolean searchList(ArrayList<Integer> receivedList, int targetNumber) 
    {
         for(Integer curNum: receivedList)
        {
            if(curNum == targetNumber)
            {
                return true; 
            }
            
         }  
        return false;
       
    }    
}    
    
    
    


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
public class Ex184 {

    /**
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
            System.out.println("User's number " + userNum + " was found");
        }
        else
        {
            System.out.println("User's number" + userNum + " was not found");
        }
    }
    public static void fillList(ArrayList<Integer> emptyList)
    {
         for(int i = 0; i < 10; i++)
         {
           emptyList.add((int)(1 + Math.random() *50 ));  
         }
          
    }
    public static void displayList(ArrayList<Integer> fullList )
    {
         for(Integer curNum: fullList)
        {
            System.out.printf("%-5d" , curNum);
        }
         System.out.println();
    }
public static boolean searchList(ArrayList<Integer> receivedList, int targetNumber)
    {
        int index = 0;
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

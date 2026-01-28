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
public class Ex180 {

    /**function that has declarations for functions and array list
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       ArrayList<Integer> listNumbers = new ArrayList<Integer>(); 
        fillList(listNumbers);
        displaylist(listNumbers);
        
    }
    /**
     * function that fills list and uses a for loop and adds 10 random numbers
     * @param receivedList 
     */
     public static void fillList(ArrayList<Integer> receivedList) 
        {
          for(int i = 0; i < 1000; i++)
          receivedList.add((int)(10 + Math.random() *89 ));
          
        }
     /**
      * function that displays list and uses for loops to print 20 characters on each line
      * @param receivedList 
      */
     public static void displaylist(ArrayList<Integer> receivedList) 
        {
            int count = 0;
             for (int i = 0; i < receivedList.size()/20; i++)
             {
                 for(int j = 0; j < 20; j++){
              
                System.out.print(receivedList.get(count) + " "); 
                count++;
                
                        } 
                 System.out.println(); 
             }
        }
     
    
}

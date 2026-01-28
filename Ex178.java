/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.involvingarraylist;

import static exercises.involvingarraylist.Ex177.displaylist;
import static exercises.involvingarraylist.Ex177.fillList;
import java.util.ArrayList;

/**
 *
 * @author 1101923
 */
public class Ex178 {
    
    /**
     * @param args the command line arguments
     *///main function that declares variables to display and fill the array list, it also declares array list variable
    public static void main(String[] args)  
         {
        ArrayList<Integer> listNumbers = new ArrayList<Integer>();
        fillList(listNumbers);
        displaylist(listNumbers);
         } 
    /**
     * 
     * @param receivedList 
     *///function that fills the array with 10 elements as stated in the for loop and adds -113 10 times
   
    public static void filllist(ArrayList<Integer> receivedList) 
         {
             for(int i = 0; i<10; i++)
             receivedList.add(-113);
          
         }
    /**
     * '
     * @param receivedList 
     *///function that displays the list with a for loop
    public static void displaylist(ArrayList<Integer> receivedList) 
         {
             for(int i = 0; i<receivedList.size();i++)
             System.out.println("Slot " + i + " contains " + receivedList.get(i));
         }       
      }
 

    



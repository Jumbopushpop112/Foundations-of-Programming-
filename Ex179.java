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
public class Ex179 {  

    /**main function with function and variable declarations
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList<Integer> listNumbers = new ArrayList<Integer>();
        fillList(listNumbers);
        displaylist(listNumbers);
    }   
    /**function that fills list using math.random and generates 10 random numbers 1 - 100
     * 
     * @param receivedList 
     */
        public static void fillList(ArrayList<Integer> receivedList)
        {
          for(int i = 0; i < 10; i++)
          receivedList.add((int)(1 + Math.random() * 100));
          
        }
        /**
         * function that displays list using print f statement and a for each loop
         * @param receivedList 
         */
        public static void displaylist(ArrayList<Integer> receivedList)
        {
             for (Integer curNum: receivedList)
                 System.out.printf("%5d", curNum); 
                 System.out.println();
        }
    }
    


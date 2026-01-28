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
public class Ex181 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { 
         int numCols = 5;
       // Create an arraylist of integers
       ArrayList<Integer> myList = new ArrayList<Integer>();
       // call method to fill list (sending it myList)
       fillList(myList);
       // call method to display myList (sending it myList)
       System.out.println("Original List");
       displayList(myList);
       //call method to copy myList (sending it myList)
       //Need a local list to receive the copied list
       ArrayList<Integer> copiedList = copyList(myList);
       //display copiedList
       System.out.println("Copied list");
       displayList(copiedList);
       //change last value in original list to a new number
       int newNum = -444;
       //Call method to change end value of orig list 
       //(sending the orig list and the new number)
       boolean front = false;
       changeEnd(myList, newNum, front);
       System.out.println("Original list with last number changed");
       displayList(myList);  

    }
    /**
     * 
     * @param emptyList 
     */
    public static void fillList(ArrayList<Integer> emptyList)
    {
      for (int i = 0; i<10; i++)
        {
            int randNum = (int)(1 + Math.random()*200);
            emptyList.add(randNum);
        }  
    }
    /**
     * 
     * @param fullList 
     */
     
     public static void displayList(ArrayList<Integer> fullList)
    {
        //use a for each loop to display contents of fullList
        for(Integer curNum : fullList)
            System.out.print(curNum + " ");
        System.out.println(); //puts cursor on new line
    }
     /**
      * 
      * @param fullList
      * @return 
      */
      public static ArrayList<Integer> copyList(ArrayList<Integer> fullList)
    {
        //local list to receive the contents of the fullList
        ArrayList<Integer> temp = new ArrayList<Integer>();
        //use a for each loop to copy fullList to temp list
        for (Integer curNum : fullList)
            temp.add(curNum);
        return temp;
    }
      /**
       * 
       * @param filledList
       * @param newNumber
       * @param front 
       */
        public static void changeEnd(ArrayList<Integer> filledList, int newNumber, boolean front)
    {
        if (front == true)
            filledList.set(0, newNumber);
        else
            filledList.set(filledList.size()-1, newNumber);
    }

}
            
 


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.involvingarraylist;

import java.util.ArrayList;

/**
 *
 * @author Matthew
 */
public class HelpfulListOps 
{
    private int maxValue;
    private int locationmaxValue;
    private ArrayList<Integer> currentList = new ArrayList<Integer>();
/**
 * Method that sets instance variable to their value
 */
public HelpfulListOps()
  {
    this.maxValue = 0;
    this.locationmaxValue = 0;
    this.currentList = new ArrayList<Integer>(); 
  }
/**
 * getters that get the maxValue in the array list and gets the location of the max value in the array
 * @return 
 */
public int getmaxValue()
  {
    return this.maxValue;
  }
public int getLocationmaxValue()
  {
    return this.locationmaxValue;
  }
/**
 * Method that fills the list with random numbers, receives the number of values, the lowest number to be filled and the highest number to be filled
 * @param numValues
 * @param lowEnd
 * @param highEnd 
 */
public void fillList(int numValues, int lowEnd, int highEnd)
  {
     //fill the array with random number 10 to 99
    	for (int i = 0; i<10; i++)
        {
            int randNum = (int)(20 + Math.random()*30);
            currentList.add(randNum);
        }  
  }
/**
 * Method that displays the list using the number of columns to display
 * @param numColumns 
 */
public void displayList(int numColumns)
  {
    //display list using a for each loop
        int count = 1;
        
        for (Integer curNum : currentList)
        {
            if (count % numColumns == 0)
                System.out.println(curNum);
            else
                System.out.printf("%-10d", curNum);
            count++;
        }
        System.out.println();//put the cursor on a new line
       

  }
/**
 * Method that gets the largest value in the array list and returns it
 */
public void searchList()
  {
      int max = currentList.get(0);
     for(int i = 1; i<currentList.size(); i++)
     {
         if(currentList.get(i)>max)
         {
           max = currentList.get(i);
            maxValue = max; 
            locationmaxValue = i;
         } 
     }
  }   
/**
 * Method that sorts the list from list to greatest, using the bubble sort method
 */
 public void sortList()
 {
     System.out.println("Entered sortList method, array list will now be sorted from least to greatest");
     int n = currentList.size();
     int temp = 0;

    for (int i = 0; i < currentList.size(); i++) {
        for (int j = 0; j < currentList.size()-1; j++) {
             
            if (currentList.get(j) > currentList.get(j+1)) {
                temp = currentList.get(j);
                currentList.set(j,currentList.get(j+1));
                currentList.set(j+1, temp);
            }       
        }
      }
   }
}  

 
 
 
 
 
 
  

        

  

    

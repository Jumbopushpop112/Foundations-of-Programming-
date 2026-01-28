
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 1101923
 */
public class MoreNotesForTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Create an arraylist of integers
        ArrayList<Integer> myList = new ArrayList<Integer>();
        //call method to fill myList
        fillList(myList);
        //call method to display myList
        displayList(myList);
        //call function to copy list.  Need local list to receive copied list
        ArrayList<Integer> copiedList = copyList(myList);
        //display copiedList
        System.out.println("Copied list");
        displayList(copiedList); 

        // TODO code application logic here
         /**
     * Fill empty list with 10 random number between 1 and 200
     * @param emptyList list to be filled
     */
    }
    public static void fillList(ArrayList<Integer> emptyList)
    {
        //generate 10 random numbers and add them to the list
        for(int i = 0; i<10; i++)
        {
            int randNum = (int) (1 + Math.random()*200);
            emptyList.add(randNum);
        }
    }//end of fillList
    
    /**
     * display contents of fullList
     * @param fullList list to display
     */
    public static void displayList(ArrayList<Integer> fullList)
    {
        //use a for each loop to display contents of fullList
        for(Integer curNum : fullList)
            System.out.print(curNum + " ");
        System.out.println(); //puts cursor on new line
    }
    /**
     * Copy list received and return the copy of the list
     * @param fullList list to be copied
     * @return copied list
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
} 
    
    


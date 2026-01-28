import java.util.ArrayList;

public class NotesWrkgWithArrayList {
    /**
     * Fill empty list with 10 random numbers between 1 to 200 
     * @param emptyList list to be filled
     */
    public static void fillList(ArrayList<Integer> emptyList)
    {
        /* generate 10 random nums and add each one to emptyList*/
        for (int i = 0; i<10; i++)
        {
            int randNum = (int)(1 + Math.random()*200);
            emptyList.add(randNum); 
        }
    }//end of fillList
    
    /**
     * display contents of list received in table format (numColumns per row)
     * @param fullList list to be displayed
     * @param numColumns amount of columns to display (display in table form)
     */
    public static void displayList(ArrayList<Integer> fullList, int numColumns)
    {
        //display list using a for each loop 
        int count = 1;
        
        for (Integer curNum : fullList)
        {
            if (count % numColumns == 0)
                System.out.println(curNum);
            else
                System.out.printf("%-10d", curNum);
            count++;
        }
        System.out.println();//put the cursor on a new line
       
    }//end of displayList
    
    /**
     * copy contents of list received
     * @param filledList is the list to be copied
     * @return copied list
     */
    public static ArrayList<Integer> copyList(ArrayList<Integer> filledList)
    {
        //Need local list to receive contents of fillList
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        //Use a for each loop to copy contents of fillList to tempList
        for (Integer curNum : filledList)
            tempList.add(curNum);
        return tempList;
    }
    /**
     * change end value of filled list
     * @param filledList list in which end value is changed
     */
    public static void changeEnd(ArrayList<Integer> filledList, int newNumber, boolean front)
    {
        if (front == true)
            filledList.set(0, newNumber);
        else
            filledList.set(filledList.size()-1, newNumber);
    }
    
    public static void main(String[] args) 
    {
        int numCols = 5;
       // Create an arraylist of integers
       ArrayList<Integer> myList = new ArrayList<Integer>();
       // call method to fill list (sending it myList)
       fillList(myList);
       // call method to display myList (sending it myList)
       System.out.println("Original List");
       displayList(myList, numCols);
       //call method to copy myList (sending it myList)
       //Need a local list to receive the copied list
       ArrayList<Integer> copiedList = copyList(myList);
       //display copiedList
       System.out.println("copied list");
       displayList(copiedList, numCols);
       //change last value in original list to a new number
       int newNum = -444;
       //Call method to change end value of orig list 
       //(sending the orig list and the new number)
       boolean front = false;
       changeEnd(myList, newNum, front);
       System.out.println("Orig list with new number in it");
       displayList(myList, numCols);  
       
    }//end of main
    
}//end of class

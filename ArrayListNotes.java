/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.involvingarraylist;

;
import java.util.ArrayList;

/**
 *
 * @author 1101923
 */
public class ArrayListNotes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //why use an array list
        //used when we don't know how many elements that are going to be collected at the start of your program
        //arraylists can shrink and grow during run time, you can add and remove elements during run time
        //arrays can't grow during run time because you know how many elements will be in the array programming 
        //when you remove middle element from an array list, all the elements to the right are shifted down one
        //you can only remove one element at a time
        // how to create an array list in java, you pick the elements Array<datatype> listname = new ArrayList<datatype>
        //you need an import statement called java.until.ArrayList;
        //spelled out words because all objects are in arrays
        //start with capital letters
        //if you know actual values, you put them in curly braces
        //one way to create an array with you know values Datatype[]arrayName = {val2, val3}
        //with numbers, not quotation marks, only separated by commas
        //or this way Datatype[] arrayName = new Datatype[numelements]
        ArrayList<Integer> listname = new ArrayList<Integer>();
         //how to fill an array list
         for(int i = 0; i<100; i++);
             listname.add(99);
             System.out.println(listname);
        String[]arrayName = {"Monday, Tuesday, Wednesday"};
        double[] numberofprices = new double[100];
        //java syntax to get data stored in array use the listname.get() method
        int firstElement = listname.get(0);
        //in an array
        double firstElementArray = numberofprices[0];
        //get last element from array
        double lastElementArray = numberofprices[numberofprices.length-1];
        //get last element of array list
        double lastE1 = listname.get(listname.size()-1);
        //set method to an assigment
        listname.set(0, -113);//sets assigments -113 to postion 0 puts -113 at the first element
        //set first element to -113
        numberofprices[0] = -113;
        //to remove first element from an array
        int removedNumber = listname.remove(0);
        //use this to remove whatever element you want from an array you CANNOT use the set or get method to do this
        //how to fill an array list 
        {
        ArrayList<Integer>listNumbers = new ArrayList<Integer>();
        {

         }
    public static void fillList(ArrayList<Integer> receivedList)
        {
            for (int i = 0; i<10; i++)
                receivedList.add(420);
               System.out.println(receivedList);
        }
        
      
        
    }//end of class 
    


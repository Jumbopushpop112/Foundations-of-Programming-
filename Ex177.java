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
public class Ex177 {

    /**
     * @param args the command line arguments
     *///function to declare variables
    public static void main(String[] args) 
    {
        ArrayList<Integer> listNumbers = new ArrayList<Integer>();
        fillList(listNumbers);
        displaylist(listNumbers);
    }
    /**
     * 
     * @param receivedList 
     *///function that adds -113; to fill the array lists
    public static void fillList(ArrayList<Integer> receivedList) 
    {
        receivedList.add(-113);
        receivedList.add(-113);
        receivedList.add(-113);
        receivedList.add(-113);
        receivedList.add(-113);
        receivedList.add(-113);
        receivedList.add(-113);
        receivedList.add(-113);
        receivedList.add(-113);
        receivedList.add(-113);
        
    }
    /**
     * 
     * @param receivedList 
     *///function to display lsit that gets -113 10 times
    public static void displaylist(ArrayList<Integer> receivedList)
    {
        System.out.println("Slot 0 contains " + receivedList.get(0)); 
        System.out.println("Slot 1 contains " + receivedList.get(1));
        System.out.println("Slot 2 contains " + receivedList.get(2));
        System.out.println("Slot 3 contains " + receivedList.get(3));
        System.out.println("Slot 4 contains " + receivedList.get(4));
        System.out.println("Slot 5 contains " + receivedList.get(5));
        System.out.println("Slot 6 contains " + receivedList.get(6));
        System.out.println("Slot 7 contains " + receivedList.get(7));
        System.out.println("Slot 8 contains " + receivedList.get(8));
        System.out.println("Slot 9 contains " + receivedList.get(9));
    }
}          

    

        
        
        
        
        
    
    


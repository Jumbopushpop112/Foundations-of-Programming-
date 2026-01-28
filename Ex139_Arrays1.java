/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.involving.arrays;

/**
 *
 * @author 1101923
 */
public class Ex139_Arrays1 
{
    


   public static void main(String[] args)
   {
   //fill array w/-113 w/loop this time and have a variable for index
    int[]myIntArray = new int [10];//array variable
    for (int i = 0; i<myIntArray.length; i++){//for loop that will display it 10 times
    
    myIntArray[i] = -113;//array variable that hold value
    System.out.printf("Element %d contains %d\n " ,i, myIntArray[i]);}
    
       
   }
}
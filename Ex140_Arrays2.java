///*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.involving.arrays;

import java.util.Random;

/**
 *
 * @author Matthew
 */
public class Ex140_Arrays2 
{
        
        
  public static void main(String[] args)
  {
     int[] myIntArray = new int [10];
     for (int i = 0; i<myIntArray.length; i++){//loop will execute code 10 times
         
        
        myIntArray[0] = (int)(1+Math.random()*100);//these int explanations will generate a random number between 1-100
        myIntArray[1] = (int)(1+Math.random()*100);
        myIntArray[2] = (int)(1+Math.random()*100);
        myIntArray[3] = (int)(1+Math.random()*100); 
        myIntArray[4] = (int)(1+Math.random()*100);
        myIntArray[5] = (int)(1+Math.random()*100);
        myIntArray[6] = (int)(1+Math.random()*100);
        myIntArray[7] = (int)(1+Math.random()*100);
        myIntArray[8] = (int)(1+Math.random()*100);
        myIntArray[9] = (int)(1+Math.random()*100);
     }    
        System.out.println("Element 0 contains: " + myIntArray[0]);//print staements that display the random array number
        System.out.println("Element 1 contains: " + myIntArray[1]);
        System.out.println("Element 2 contains: " + myIntArray[2]);
        System.out.println("Element 3 contains: " + myIntArray[3]);
        System.out.println("Element 4 contains: " + myIntArray[4]);
        System.out.println("Element 5 contains: " + myIntArray[5]);
        System.out.println("Element 6 contains: " + myIntArray[6]);
        System.out.println("Element 7 contains: " + myIntArray[7]);
        System.out.println("Element 8 contains: " + myIntArray[8]);
        System.out.println("Element 9 contains: " + myIntArray[9]); 
        
        
         
     }
  }
   


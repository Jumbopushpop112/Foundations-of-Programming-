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
public class Ex141_Arrays3 
{
    public static void main(String[] args)
    {
        int[] myIntArray = new int [1000];
        for (int i = 0; i < myIntArray.length; i++) { //for loop that will make it so it doesn't go over 1000 random numbers
            myIntArray[i] =(int)(10 + Math.random() * 90);
            if ((i != 0) && (i % 20 == 0)) {//qualifier that checks if there are 20 numbers in the line of code
                System.out.print("\n");//puts a new line
            }
            System.out.print(myIntArray[i] + " ");
        }
    }
}
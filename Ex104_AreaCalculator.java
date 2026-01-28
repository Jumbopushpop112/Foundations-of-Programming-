/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisesinvolvingfunctions;

import java.util.Scanner;

/**
 *
 * @author 1101923
 */
public class Ex104_AreaCalculator 
{
     public static void main(String args[]){
    Scanner keyBoard = new Scanner (System.in);
    int userShape = 0;
    boolean isUserDone = false;
    int radius = 0;
    int base = 0;
    int height = 0;
    int length = 0;
    int width = 0;
    int side = 0;
   
    do{
        System.out.println("1) Triangle:\n"+ "2) Circle\n"
                    + "3) Square\n"
                    + "4) Rectangle\n"
                    + "5) Quit\n"
                    + "Enter your Choice: ");
         
        if (keyBoard.hasNextInt())
             userShape = keyBoard.nextInt();
        else
        {
          System.out.println("Invalid shape. Program will now exit");
          System.exit(-1);
        }
        if (userShape == 1)//statement asking user for formula info to find area of triangle
        {
            System.out.println("Enter base and height please");
            
            if (keyBoard.hasNextInt())
            {
                base = keyBoard.nextInt();
                if (keyBoard.hasNextInt())
                    height = keyBoard.nextInt();
                else
                {
                    System.out.println("Invalid base and height entered, program will now exit");
                    System.exit(-1);
                }
            }
            else 
            {
                System.out.println("Invalid base and height entered, program will now exit");
                System.exit(-1);
            }
            
            System.out.println("The area of your triangle is: " + area_triangle(base, height));
        }//end of userShape is 1    
         
                
        else if (userShape == 2) //user chose circle and the computer will do the program
        {
            System.out.println("Enter radius");
            if (keyBoard.hasNextInt())
                radius = keyBoard.nextInt();
            else
            {
               System.out.println("Invalid radius, program will now terminate");
               System.exit(-1);
            }
            System.out.println("The area of your circle is: " + area_circle(radius));
        }//end user chose circle
          
                
        else if (userShape == 3)// calculations that happen when user chose square as shapre choice
        {
           System.out.println("Please enter a side length");
           
           if (keyBoard.hasNext())
                  side = keyBoard.nextInt();
            else
            {
               System.out.println("Invlaid side, program will now exit");
               System.exit(-1);
            }
            System.out.println("The area of your square is: " + area_square(side));
        }//end if usershape = 3 (square)
        
                  
        else if (userShape == 4)//calculations for area of rectangle, remember computer will do ther formula with the entered dimensions
        {
            System.out.println("Please enter a length");
            if (keyBoard.hasNextInt())
                      length = keyBoard.nextInt();
            else
            {
                System.out.println("Invalid length and width, program will now terminate");
                System.exit(-1);
            }
            
            System.out.println("Please enter a width");
            if(keyBoard.hasNextInt())
                width = keyBoard.nextInt();
            else
            {
                System.out.println("Invalid length and width, program will now terminate");
                System.exit(-1);
            }
            System.out.println("The area of your rectangle is: " + area_rectangle(length, width)); 
        }//end if usershape is 4 (rectangle)
             
        else if (userShape == 5)//users is done picking shapes set isUserdone to true
        {
            isUserDone = true;
        }
        else
        {
            System.out.println("Sorry, shape choice wasn't from 1 to 5, that was the choice range, program will now exit");
            System.exit(-1);
        }
     }while(isUserDone == false);
     System.out.println("Goodbye!");
  }//end of main                  
     
    /**
     * 
     * @param base
     * @param height
     * @return 
     */
    public static double area_triangle(int base, int height)//this functions returns the formula for what the user entered when shape = 1  
    {
        return 0.5 * base * height;
    }
    public static double area_circle(int radius)
    {
        return Math.PI * Math.pow(radius,2);
    }
    public static double area_square(int side)
    {
        return side * side;
    }
    public static double area_rectangle(int length, int width)
    {
        return length * width;
    }

}//end of class

                 
             

                  

    


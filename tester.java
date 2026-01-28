/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.with.inheritance;

/**
 *
 * @author 1101923
 */
public class tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Snake mySnake = new Snake();
        String name = mySnake.getName();
        String school = mySnake.getSchool(); 
        mySnake.setName("James");
        System.out.println("A snake named " + name + " is having a good life!!"); 
        mySnake.bite(name);
        System.out.println("Even though my name is " + name + " I only bite people I don't like");
        mySnake.bite(name);
        System.out.println("Ewww, this person tastes gross");
      
        mySnake.getSchool();
        System.out.println("The school " + name + " goes to  is " + school + " ");
        System.out.println("When all this occurs a day of " + name + " the day is over! Goodnight");
        

        
        
        
    }
    
}

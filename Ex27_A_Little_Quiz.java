/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.statements.ex21.to.ex28;

import javax.swing.JOptionPane;

/**
 *
 * @author 1101923
 */
public class Ex27_A_Little_Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare and initialize variables as neeed
        int numCorrect = 0;
        
        /*
        Q1) What is the capital of Alaska?
        1) Melbourne
        2) Anchorage
        3) Juneau
        */
        String question = "Q1) What is the captial of Alaska?\n";
        question = question + "\t 1) Melbourne\n";
        question += "\t 2) Anchorage\n";
        question += "\t 3) Juneau";
       
       int result = 0;
       result = Integer.parseInt(JOptionPane.showInputDialog(question));
       
       if (result == 3)
       { 
          //anw is correct
          System.out.println("Well Done");
          numCorrect = numCorrect + 1;
          //numCorrect++; //this also adds one to value stored
       }
       
       else
           //ans is incorrect
           System.out.println("Incorrect");
       
 
           //For Qtn 2 and 3 you can reuse the result and question variables via reassignment (overwrite)
           /*
           Q2) can you store the value "cat"  in a variable type int?
           1) yes
           2) no
           */
           question = "Q2) can you store the value \"cat\" in a variable type int?\n";
           question += "\t1) yes\n";
           question += "\t2) no\n";
           result = Integer.parseInt(JOptionPane.showInputDialog(question));
           
           if (result == 1)
       { 
          //anw is correct
          System.out.println("Well Done");
          numCorrect = numCorrect + 1;
          //numCorrect++; //this also adds one to value stored
       }
       
       else
           //ans is incorrect
           System.out.println("Incorrect");
           
          /*
         Q3) What is the result of 9+6/3?
           1) 5
           2) 11
           3) 15/3
           */
          question = "Q3) What is the result of 9+6/3?\n";
          question += "\t1) 5\n";
          question += "\t2 11\n";
          question += "\t2 15/3\n";
          result = Integer.parseInt(JOptionPane.showInputDialog(question));
          
          if (result == 2)
       { 
          //anw is correct
          System.out.println("Well Done");
          numCorrect = numCorrect + 1;
          //numCorrect++; //this also adds one to value stored
       }
       
       else
           //ans is incorrect
           System.out.println("Incorrect");
          
          System.out.println("Overall, you got " + numCorrect + " of 3");
          
           
           
           
           
           
           
           
           
    } 
    
}   
    

    
         
          
       
    
    


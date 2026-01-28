/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtheory;

/**
 *
 * @author 1101923
 */
public class StringTheory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String str1 = "Bibbety";
    String str2 = "Bobbety";
    String str3 = "Boo";
    String str4 = "BIBBETY";
    
    System.out.println("str1 equals str4: " + str1.equals(str4));
    System.out.println("str1 equals str4 (ignore case): " + str1.equalsIgnoreCase(str4));
    System.out.println("str1 replacing 'b' with 'p' " + str1.replace("b","p"));
    System.out.println("str2 first 3 characters: " + str2.substring(0,3));
    System.out.println("str3 uppercase: " + str3.toUpperCase());
    System.out.println(String.format("the current time is: %tr" , Calendar.getInstance())); 
    System.out.println("str1 + str2: " + str1 + (str2));
    System.out.println("parseInt results:" +Integer.parseInt("5"));
    System.out.println();
    
           
           
    }
    
   
    
    


    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.methods;

/**
 *
 * @author Matthew
 */
public class StringMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strOriginal = "Hello";
        String strModified = "";
        String lastTwo = "";
        lastTwo = strOriginal.charAt(strOriginal.length()-2) + strOriginal.charAt(strOriginal.length()-1);
        strModified = lastTwo + lastTwo + lastTwo;
        System.out.println("original string is " + strOriginal);
        System.out.println("modified string is " + strModified);
    }
}
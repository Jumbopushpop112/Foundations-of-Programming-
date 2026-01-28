/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1101923
 */
public class GeometryTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Create a square object with default length and width of one
        //Scanner keyBoard = new Scanner ();
        Square square1 = new Square();
        //keyboard.nextInt()
        //Print area of square1
        //System.out.println("Area of square1 is: " + square1.calculateArea()); 
        
        //Build another square but send it your own length, width and color
        Square square2 = new Square(5.3, 6.2, "blue");
        System.out.println("Area of square is: " + square2.calculateArea());
        
        Square square3 = new Square(5.4, 6.7);
        System.out.println("Area of square is: " + square3.calculateArea()); 
    }
    
}

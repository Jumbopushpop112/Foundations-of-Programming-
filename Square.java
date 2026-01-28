/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1101923
 */
public class Square 
{  
    //First declare instance varaibles used to describe your object(square)
    //also known as properties/attributes
    /* ACESS SPECIFIERS: PRIVATE, PUBLIC, PROTECTED
    private means can only access varaible/method from within class
    public means you can access variable/method anywhere, inside or outside the class or package
    protected means you can access variabe/method from any file from within the same
    package
    */
   private double length;
   private double width;
   private String color;
   
   //2nd initialize instance variables via constructor(s)
   //Empty argument constructor used to initialize properties to default valued
   public Square()
   {
       System.out.println("Enter empty arg constructor");
       length = 1;
       width = 1;
       color = "red";
   }
   //Another constructor to recieve length, width, and color from tester
   public Square(double length, double width, String color)
   {
       System.out.println("Entered constructor with parameters");
       this.length = length;
       this.width = width;
       this.color = color;
   }
   public Square(double length, double width)
   {
        
   }
   //3rd start defining your methods (action verbs)
   public double calculateArea()
   {
       System.out.println("Entered calc area method");
       return length * width;
   }
   
}//end of class

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi.categories.using.oop;

/** constructor for person that will receive instance variables
 *
 * @author 1101923
 */
public class Person 
{
    private String firstName;
    private String lastName;
    private double heightFt;
    private double heightInches;
    private double weightPounds;
    private double BMI;
    private String BMI_Category;
    
    /**
     * empty argument constructor that initializes variables to default values
     */
    public Person()
    {
        this.firstName = "";  
        this.lastName = "";
        this.heightFt = 0.0;
        this.heightInches = 0.0;
        this.weightPounds = 0.0; 
        this.BMI = 0.0;
        this.BMI_Category = "";
    }
    /**
     * constructor for the person entering info that returns height in feet and inches, weight in pounds, and user's first and last name
     * @param firstName
     * @param lastName
     * @param heightFt
     * @param heightInches
     * @param weightPounds 
     */
    public Person(String firstName, String lastName, double heightFt, double heightInches, double weightPounds)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.heightFt = heightFt;
        this.heightInches = heightInches;
        this.weightPounds = weightPounds;
        this.BMI = calculateBMI();
        this.BMI_Category = classifyBMI();
        
    }
    /**
     * constructors to first name, returns first name as string
     * @return 
     */
    public String getFirstName()
    {
        return this.firstName;
    }
    /**
     * constructors to last name, returns first name as string
     * @return 
     */
    public String lastName() 
    {
        return this.lastName;
    }
    /**
     * constructors to height in feet which returns height as a double
     * @return 
     */
    public double heightFT()
    {
        return this.heightFt;
    }
   /**
     * constructors to height in inches, returns height in inches as a double
     * @return 
     */
    public double heightInches()
    {
        return this.heightInches;
    }
    /**
     * constructors to weight in pounds, returns weight in pounds as a double
     * @return 
     */
    public double weightPounds()
    {
        return this.weightPounds;
    }
   
    /**
     * constructor that will calculate BMI user has entered
     * @return 
     */
    private double calculateBMI()
       {
           return this.weightPounds /  Math.pow(this.heightFt * 12 + this.heightInches, 2) * 703;
       }
    /**
     * constructor that will classify what BMI category user belongs to once BMI is calculated
     * @return 
     */
     public String classifyBMI()
    {
        if (this.BMI < 18.5)
           return "underweight"; 
        else if ((this.BMI >= 18.5) && (this.BMI <= 24.9))
           return "normal weight";
        else if ((this.BMI >= 25.0) && (this.BMI <= 29.9))
            return "overweight";
        else 
            return "obese"; 
       
           
    }
}

    


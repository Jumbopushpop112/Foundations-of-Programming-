/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usingvariables;

/**
 *
 * @author Matthew
 */
public class UsingVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;
        
        // how many cars we have
        cars = 100;
        // how many people can fit in a car
        space_in_a_car = 4.0;
        // how many people are driving cars
        drivers = 30;
        // how many people are in cars
        passengers = 90;
        // the number of empty cars
        cars_not_driven = cars - drivers;
        // how many cars were driven
        cars_driven = drivers;
        // how many people we can transport
        carpool_capacity = cars_driven * space_in_a_car;
        // how many people will be riding in a car
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
    
}



public class MoreVariablesAndPrinting
{
    public static void main( String[] args )
    {
        String Name, Eyes, Teeth, Hair;
        int Age, Height, Weight;

        Name = "Zed A. Shaw";
        Age = 35;     // not a lie
        Height = 74;  // inches
        Weight = 180; // lbs
        Eyes = "Blue";
        Teeth = "White";
        Hair = "Brown";

        System.out.println( "Let's talk about " + Name + "." );
        System.out.println( "He's " + Height + " inches tall." );
        System.out.println( "He's " + (Height * 2.54) + " centimeters tall." );
        System.out.println( "He's " + Weight + " pounds heavy." );
        System.out.println( "He's " + (Weight * 0.453592) + " kilograms heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + Eyes + " eyes and " + Hair + " hair." );
        System.out.println( "His teeth are usually " + Teeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + Age + ", " + Height + ", and " + Weight
            + " I get " + (Age + Height + Weight) + "." );
    }
  
}



public class UsingVariables2
{
    public static void main( String[] args )
    {
        int RoomNumber;
        double e;
        String Message;
        
        RoomNumber = 113;
        e = 2.71828;
        Message = "Computer Science";
        
        System.out.println("This is room # " + RoomNumber);
        System.out.println("e is close to " + e);
        System.out.println("I am learning a bit about " + Message);
    }
}


public class StillUsingVariables
{
    public static void main( String[] args )
    {
        String Name;
        int Year;
        
        Name = "Matthew Hart";
        Year = 2023;
        
        System.out.println("My name is " + Name + " and I'll graduate in " + Year + ".");
    }
}


public class YourSchedule
{
    public static void main( String[] args )
    {
        String course1, course2, course3, course4, course5, course6, course7;
        String teacher1, teacher2, teacher3, teacher4, teacher5, teacher6, teacher7;
        
        course1 = "          English 1 Honors";
        course2 = "        ACAD Communication";
        course3 = "          Food Preparation";
        course4 = "      World History Honors";
        course5 = "                 Algebra 1";
        course6 = "                   Biology";
        course7 = "Foundations of Programming";
        
        teacher1 = "  Mrs. Boone";
        teacher2 = "   Dr. Hicks";
        teacher3 = "Mrs. Scholle";
        teacher4 = " Mr. Vincent";
        teacher5 = "   Mr. Klebs";
        teacher6 = " Mr. Parsons";
        teacher7 = "  Mr. Dohmen";
        
        System.out.println("+-----------------------------------------------+");
        System.out.println("| 1 | " + course1 + " | " + teacher1 + " |");
        System.out.println("| 2 | " + course2 + " | " + teacher2 + " |");
        System.out.println("| 3 | " + course3 + " | " + teacher3 + " |");
        System.out.println("| 4 | " + course4 + " | " + teacher4 + " |");
        System.out.println("| 5 | " + course5 + " | " + teacher5 + " |");
        System.out.println("| 6 | " + course6 + " | " + teacher6 + " |");
        System.out.println("| 7 | " + course7 + " | " + teacher7 + " |");
        System.out.println("+-----------------------------------------------+");
    }
}
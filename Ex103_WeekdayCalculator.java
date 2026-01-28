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
public class Ex103_WeekdayCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { 
       Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();
                

		
		System.out.println("You were born on " + (strDayOfWeek + mm + dd + yyyy));
	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		int yy, total;
		String date = "";

		// bunch of calculations go here
                yy = yyyy - 1900;
                total = ( yy / 4) + yy + dd + (mm);
                
                if ( is_leap(yyyy) == true && mm == 1 || mm == 2)
                    total =- 1;

		date = mm + ", " + yyyy;
                int remainder = (total % 7);
                String strDayOfWeek = weekday_name(remainder);
                String finaldate  = "strDayOfWeek + ", " + month_name(mm) + " " + dd + ", " + yyyy);
                
                return strDayOfWeek;
		return date;
                
	}
 public static String month_offset (int monthnumber)
        {
            
          if (monthnumber == 1)
          return "1";
          if (monthnumber == 2)
          return "2";
          if (monthnumber == 3)
          return "3";
          if (monthnumber == 4)
          return "4";
          if (monthnumber == 5)
          return "5";
          if (monthnumber == 6)
          return "6";
          if (monthnumber == 7)
              return "7";
          if (monthnumber == 8)
              return "8";
          if (monthnumber == 9)
              return "9";
          if (monthnumber == 10)
              return "10";
          if (monthnumber == 11)
              return "11";
          if (monthnumber == 12)
             return "12";
          
          else
              return "-1";
        }
public static String weekday_name( int weekday )
{
    String result = "";

    if ( weekday == 1 )
    {
            result = "Sunday";
    }
    else if ( weekday == 2 )
    {
            result = "Monday";
    }
    else if ( weekday == 3 )
     {
         result = "Tuesday";
     }
    else if ( weekday == 4 )
     {
         result = "Wednesday";
     }
    else if ( weekday == 5 )
     {
         result = "Thursday";
     }
    else if ( weekday == 6 )
     {
         result = "Friday";
     }
    else if ( weekday == 7 )
     {
         result = "Saturday";
     }
    else if ( weekday == 0 )
     {
         result = "Saturday";
     }
     else
     {
         result = "error";
     }
    
  

    return result;
}
       
	// paste your functions from MonthName, WeekdayName, and MonthOffset here 
		
	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}
}
    
    


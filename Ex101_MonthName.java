/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tem-+plate file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisesinvolvingfunctions;

/**
 *
 * @author 1101923
 */
public class Ex101_MonthName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  
    {
        
       
        //these are the outputs that will run the month names
                System.out.println( "Month 1: " + month_name(1) );
		System.out.println( "Month 2: " + month_name(2) );
		System.out.println( "Month 3: " + month_name(3) );
		System.out.println( "Month 4: " + month_name(4) );
		System.out.println( "Month 5: " + month_name(5) );
		System.out.println( "Month 6: " + month_name(6) );
		System.out.println( "Month 7: " + month_name(7) );
		System.out.println( "Month 8: " + month_name(8) );
		System.out.println( "Month 9: " + month_name(9) );
		System.out.println( "Month 10: " + month_name(10) );
		System.out.println( "Month 11: " + month_name(11) );
		System.out.println( "Month 12: " + month_name(12) );
		System.out.println( "Month 43: " + month_name(43) );
    } 
        public static String month_name (int par)//these function will return the integer par
    {
        //these if statements will check what the par is equal to, any option that isn't in a statement will be returned as "error"
        if (par == 1)
        return "January";
        if (par == 2)
        return "February";
        if (par == 3)
        return "March";
         if (par == 4)
        return "April";
          if (par == 5)
        return "May";
           if (par == 6)
        return "June";
            if (par == 7)
        return "July";
             if (par == 8)
        return "August";
              if (par == 9)
        return "September";
               if (par == 10)
        return "October";
                if (par == 11)
        return "November";
                 if (par == 12) 
        return "December";
    
       else
         return "error";  
                 

    }
}
     
        	
    

    
    


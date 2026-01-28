/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisesinvolvingfunctions;

/**
 *
 * @author 1101923
 */
public class Ex102_MonthOffset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        
        // these outputs display
		System.out.println( "Offset for month 1: " + month_offset(1) );
		System.out.println( "Offset for month 2: " + month_offset(2) );
		System.out.println( "Offset for month 3: " + month_offset(3) );
		System.out.println( "Offset for month 4: " + month_offset(4) );
		System.out.println( "Offset for month 5: " + month_offset(5) );
		System.out.println( "Offset for month 6: " + month_offset(6) );
		System.out.println( "Offset for month 7: " + month_offset(7) );
		System.out.println( "Offset for month 8: " + month_offset(8) );
		System.out.println( "Offset for month 9: " + month_offset(9) );
		System.out.println( "Offset for month 10: " + month_offset(10) );
		System.out.println( "Offset for month 11: " + month_offset(11) );
		System.out.println( "Offset for month 12: " + month_offset(12) );
		System.out.println( "Offset for month 43: " + month_offset(43) );
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
}
              

    
    


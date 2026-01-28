/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.involvingarraylist; 



/**
 *
 * @author Matthew
 */
public class Driver_Ex185_189_PBD {

    /** Main function that has parameter variable declarations and uses the HelpfulListOps variable to access the method in the HelpfulListOps class, it displays location and largest value in the array correctly
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       int numValues = 10;
       int lowEnd = 20;
       int highEnd = 30;
       HelpfulListOps listHelper = new HelpfulListOps();  
       System.out.println("Array List");
       listHelper.fillList(numValues,lowEnd,highEnd);
       int numColumns = 10;
       listHelper.displayList(numColumns);
       listHelper.searchList(); 
       System.out.printf("The largest value in the array list is %d\n",listHelper.getmaxValue());  
       System.out.printf("The largest value in the array list is found in slot number %d\n",listHelper.getLocationmaxValue());
       listHelper.sortList();
       listHelper.displayList(numColumns);
       
       
       
       
       
       
       
       
       
    }
    
}

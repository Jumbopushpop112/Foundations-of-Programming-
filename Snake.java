/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.with.inheritance;

/**
 *
 * @author 1101923
 */
public class Snake 
{
    private String firstName;
    private String species;
    private String sleep;
    private String school;
    
   public String getName()
    {
        return this.firstName;
    }  
   public void setName(String name)
   {
       this.firstName = "James";
   }
   public String getSchool()
   {
       return this.school; 
   }
    
    /**
     * 
     */
    public Snake()
    {
        this.firstName = "James";
        this.species = "Reptile";
        this.school = "Viera High School";
    }
    public void slitherup(String fish) 
    {
       System.out.println("I love fish that's why I slitherup");
       
    }
    public void bite(String person)
    {
       System.out.println("I love to bite people");
       this.species = "snake";
       
        
    }
}
    
    
  


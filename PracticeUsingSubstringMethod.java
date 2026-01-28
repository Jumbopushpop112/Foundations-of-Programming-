/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chp5exercises;

/**D
 *
 * @author Matthew
 */
public class PracticeUsingSubstringMethod {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Dog = "You aint nothing but hound dog";
        String FirstEight = "";
        
        FirstEight = Dog.substring(0,8);
        System.out.println(FirstEight + " " + FirstEight + " " + FirstEight);   // added space characters to match example
        
        System.out.println(Dog.substring(0,Dog.length()/2));    // output in example is wrong
    } 
}

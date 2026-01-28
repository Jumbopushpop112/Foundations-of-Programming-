/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.statements.ex21.to.ex28;

import javax.swing.JOptionPane;

/**
 *
 * @author 1101923
 */
public class Ex26_Space_Boxing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double earthweight = Double.parseDouble(JOptionPane.showInputDialog("Please enter your current earth weight:"));
        System.out.println("I have information for the following planets:");
        System.out.println("   1. Venus   2. Mars    3. Jupiter");
        System.out.println("   4. Saturn  5. Uranus  6. Neptune");
        int visitingplanet = Integer.parseInt(JOptionPane.showInputDialog("Which planet are you visiting?"));
        double relativegravity = 1.0;
        
        if (visitingplanet == 1)
            relativegravity = 0.78;
        if (visitingplanet == 2)
            relativegravity = 0.39;
        if (visitingplanet == 3)
            relativegravity = 2.65;
        if (visitingplanet == 4)
            relativegravity = 1.17;
        if (visitingplanet == 5)
            relativegravity = 1.05;
        if (visitingplanet == 6)
            relativegravity = 1.23;
         double finalweight = earthweight * relativegravity;
         
         System.out.println("Your weight would be " + finalweight + " pounds on that planet.");
        
        
        
    }
    
}

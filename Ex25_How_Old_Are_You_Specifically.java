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
public class Ex25_How_Old_Are_You_Specifically {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Get name from user
        String name = JOptionPane.showInputDialog("Enter your name");
        int score = Integer.parseInt(JOptionPane.showInputDialog("Enter your test score"));
        String grade = "";
        
        if (score >= 90 && score <= 100)
            grade = "A";
        else if (score >= 80 && score < 89)
            grade = "B";
        else
            grade = "F";
        
        System.out.println ("With a score of : " + score + " your grade is: " + grade);
        
    }
    
}

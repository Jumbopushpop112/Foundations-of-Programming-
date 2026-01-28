/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.involving.arrays;

/**
 *
 * @author 1101923
 */
public class Chapter14_Tictactoe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  
    {
        char[][] board = {{'X','O',' '},
                         {'O', 'X','X'},
                         {'X', ' ','O'}};
        
        for (int i=0; i<board.length; i++)
      {
         for (int j=0; j<board[i].length; j++)
         {
            System.out.print(board[i][j]);
         }
         System.out.println();
      }               
     
        
    }
    
}

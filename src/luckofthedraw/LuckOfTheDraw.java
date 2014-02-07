/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package luckofthedraw;

/**
 *
 * @author jonathanmolson
 */
public class LuckOfTheDraw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        PlayingCard player1 = new PlayingCard();
        PlayingCard player2 = new PlayingCard();
        
        if(player1.getValue()>player2.getValue())
        {
            System.out.println("Player 1 wins");
        }
        else if(player2.getValue()>player1.getValue())
        {
            System.out.println("Player 2 wins");
        }
        else
        {
            System.out.println("It's a draw");
        }
    }
}

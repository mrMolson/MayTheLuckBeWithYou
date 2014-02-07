/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package luckofthedraw;

/**
 *
 * @author jonathanmolson
 */
public class LuckOfTheDrawExtended {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        PlayingCard player1 = new PlayingCard();
        PlayingCard player2 = new PlayingCard();
        
        String Str2Out = "Player 1 drew the " + player1.valueToString() + " of " + player1.getSuit();
        System.out.println(Str2Out);
        Str2Out = "Player 2 drew the " + player2.valueToString() + " of " + player2.getSuit();
        System.out.println(Str2Out);
        
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

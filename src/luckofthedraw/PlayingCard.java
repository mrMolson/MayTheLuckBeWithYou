/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package luckofthedraw;

import java.util.Random;

/**
 *
 * @author jonathanmolson
 */
public class PlayingCard 
{
    
    private String suit;
    private int value;
    
    public PlayingCard()
    {
        Random randomGen = new Random();
        int randomNum = randomGen.nextInt(52) + 1;
        value = randomNum % 14;
        int suitValue = randomNum / 13;
        
        if(suitValue == 1)
        {
            suit = "hearts";
        }
        else if(suitValue == 2)
        {
            suit = "diamonds";
        }
        else if(suitValue == 3)
        {
            suit = "spades";
        }
        else
        {
            suit = "clubs";
        }
    }
    
    public String getSuit()
    {
        return suit;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public String valueToString()
    {
        if(value==1)
        {
            return "Ace";
        }
        if(value==11)
        {
            return "Jack";
        }
        else if(value==12)
        {
            return "Queen";
        }
        else if(value==13)
        {
            return "King";
        }
        else
        {
            return Integer.toString(value);
        }
    }
}

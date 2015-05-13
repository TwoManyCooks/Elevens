package Activity02;


/**
 * Write a description of class DeckTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeckTester
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) 
    {
        String[] ranks = {"Ace", "Two", "Three","Four", "Five", "Six","Seven", "Eight", "Nine","Ten", "Jack", "Queen","King"};
        String[] suits = {"Spade", "Club","Diamond", "Heart"};
        int[] pointValues = {1,2,3,4,5,6,7,8,9,10,11, 12, 13};    
        Deck c = new Deck(ranks, suits, pointValues);
        System.out.println(" isEmpty should be false " + c.isEmpty());
        System.out.println(" size should be 52 " + c.size());
        System.out.println(" deal the card : " + c.deal());
        System.out.println(" size now should be 51 " + c.size());
        for (int i = 0; i < 51 ; i ++)
        {
            System.out.print(c.deal());
        }
        System.out.println("");
        System.out.println(" size check " + c.size());
        System.out.println(" isEmpty check " + c.isEmpty());
        
    }
}

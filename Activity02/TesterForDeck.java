package Activity02;


/**
 * Write a description of class TesterForDeck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TesterForDeck
{
    // instance variables - replace the example below with your own
    private String[] ranks = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
    private String[] suits = {"Spade","Club","Diamond","Heart"};
    private int[] values = {0,2,3,4,5,6,7,8,9,10,11,12};

    /**
     * Constructor for objects of class TesterForDeck
     */
    public TesterForDeck()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void DeckTestisEmpty()
    {
        Deck Deck1 = new Deck(ranks,suits,values);
        assertFalse(Deck1.isEmpty());
    }
    /**
     * Test   Method in Deck
     */
    public void DeckTestsize()
    {
        Deck Deck1 = new Deck(ranks,suits,values);
        assertEquals(52,Deck1.size(),1);
    }
    /**
     * Test   Method in Deck
     */
    public void DeckTestDeal()
    {
        Deck Deck1 = new Deck(ranks,suits,values);
        Deck1.deal();
        assertEquals(51,Deck1.size(),1);
    }
}

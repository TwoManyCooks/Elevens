package Activity01;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CardTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CardTester
{
    private Card Card1;
    private Card Card2;
    private Card Card3;
    /**
     * Default constructor for test class CardTester
     */
    public CardTester()
    {
        
    }
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    /**
     * Tester for Card Suit
     */
    @Test
    public void CardTestSuit()
    {
        Card Card1 = new Card("King","Heart",13);
        assertEquals("Heart", Card1.suit());
        
    }
    /**
     * Tester for Card Rank
     */
    @Test
    public void CardTestRank()
    {
        Card Card3 = new Card("Queen","Club",12);
        assertEquals("Queen", Card3.rank());
    }
    /**
     * Tester for Card Point Value
     */
    @Test
    public void CardTestPoint()
    {
        Card Card1 = new Card("King","Heart",13);
        assertEquals(13,Card1.pointValue(), .01);
    }
    /**
     * Tester for maches True
     */
    @Test
    public void CardTestMatchesTrue()
    {
        Card Card1 = new Card("King","Heart",13);
        Card Card2 = new Card("King","Heart",13);        
        assertTrue(Card1.matches(Card2));
    }
    /**
     * Tester for maches False
     */
    @Test
    public void CardTestMatchesFalse()
    {
        Card Card1 = new Card("King","Heart",13);
        Card Card3 = new Card("Queen","Club",12);        
        assertFalse(Card1.matches(Card3));
    }
    
}

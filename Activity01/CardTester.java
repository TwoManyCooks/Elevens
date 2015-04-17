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
        Card1 = new Card("King","Heart",13);
        Card2 = new Card("King","Heart",13);
        Card3 = new Card("Queen","Club",12);
    }
    /**
     * Tester for Card Suit
     */
    public CardTestSuit()
    {
        System.out.println(Card1.suit());
        
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
}

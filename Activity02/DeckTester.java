package Activity02;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DeckTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DeckTester
{
    private String[] ranks = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
    private String[] suits = {"Spade","Club","Diamond","Heart"};
    private int[] values = {0,1,2,3,4,5,6,7,8,9,10,11,12};
    private Deck Deck1 = new Deck(ranks,suits,values);    
    /**
     * Default constructor for test class DeckTester
     */
    public DeckTester()
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
     * Test   Method in Deck
     */
    @Test
    public void DeckTestisEmpty()
    {
        assertFalse(Deck1.isEmpty());
    }
    /**
     * Test   Method in Deck
     */
    @Test
    public void DeckTestsize()
    {
        assertEquals(52,Deck1.size(),.1);
    }
    /**
     * Test   Method in Deck
     */
    @Test
    public void DeckTestDeal()
    {
        Deck1.deal();
        assertEquals(51,Deck1.size(),.1);
    }
}

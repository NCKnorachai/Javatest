import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class test{
    QuizOneJunit q= new QuizOneJunit();
    @Test
    public void testAletter(){
        assertEquals(4, q.countLetterA("agrabgajua"));
    }
    @Test
    public void testTwoletterFalse(){
        assertFalse(q.checkTwoLetter("h"));
    }
    @Test
    public void testTwoletterTrue(){
        assertTrue(q.checkTwoLetter("hh"));
    }
    @Test
    public void squareTest(){
        assertEquals(25, q.square(5));
    }
    @Test
    public void squareTestNotEquals(){
        assertNotEquals(2, q.square(5));
    }
}

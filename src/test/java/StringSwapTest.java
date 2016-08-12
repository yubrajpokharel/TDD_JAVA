import com.yubraj.StringSwap;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by yubraj on 8/12/16.
 */
public class StringSwapTest {

    public StringSwap swap;

    @Before
    public void setUp(){
        swap = new StringSwap();
    }

    @Test
    public void stringWithTwoCharsTest(){
        assertEquals("BA", swap.swapLastTwoChar("AB") );
    }

    @Test
    public void stringWith4CharsTest(){
        assertEquals("ABDC", swap.swapLastTwoChar("ABCD"));
    }

    @Test
    public void stringWithMoreThan4Chars(){
        assertEquals("asdf", swap.swapLastTwoChar("asfd"));
        assertEquals("ABCDEFGHJI", swap.swapLastTwoChar("ABCDEFGHIJ"));
        assertEquals("mynameisyubrja", swap.swapLastTwoChar("mynameisyubraj"));
    }

    @Test
    public void stringWithSingleCharTest(){
        assertEquals("A", swap.swapLastTwoChar("A"));
    }

    @Test
    public void stringWithEmptyCharTest(){
        assertEquals("", swap.swapLastTwoChar(""));
    }

    @Test
    public void stringWithSpecialCharTest(){
        assertEquals("@#", swap.swapLastTwoChar("#@"));
        assertEquals("IamLegen$", swap.swapLastTwoChar("Iamlege$s"));
    }

}
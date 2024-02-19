import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SubstractTest {
    @Test
    public void testSubtract() {
        int result = Calculator.subtract(10,5);
        assertEquals(5, result);
    }
}

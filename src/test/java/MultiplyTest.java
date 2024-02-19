import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {
    @Test
    public void testMultiply() {
        int result = Calculator.multiply(2, 3);
        assertEquals(6, result);
    }
}

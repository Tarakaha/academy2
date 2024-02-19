import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTest {
    @Test
    public void testAdd() {
        int result = Calculator.add(2, 3);
        assertEquals(5, result);
    }
}

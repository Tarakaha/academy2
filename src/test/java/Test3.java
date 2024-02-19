import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertEquals;

public class Test3 {
    @ParameterizedTest
    @ValueSource(ints = {10, 5, 7})
    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(3, calc.subtract(5, 2));
    }
}




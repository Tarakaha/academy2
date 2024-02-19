import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathLibraryTest {
    @Test
    public void testAbsFunction() {
        double result = Math.abs(-13.3);
        assertEquals(13.3, result, 0);
    }
}


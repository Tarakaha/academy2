import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathLibraryTest2 {
        @Test
        public void testMaxValueFunction() {
            int result = Math.max(20,10);
            assertEquals(20,result,0);
        }
    }
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// Класс, представляющий ваш Test Suite
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AddTest.class,
        SubstractTest.class,
        MultiplyTest.class,

})
public class CalculatorTestSuite {
    // В этом классе ничего писать не нужно. Он будет содержать только аннотации.
}

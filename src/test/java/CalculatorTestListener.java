import org.junit.runner.JUnitCore;

public class CalculatorTestListener extends org.junit.runner.notification.RunListener {
    @Override
    public void testFinished(org.junit.runner.Description description) throws Exception {
        System.out.println("Успешно завершен тест: " + description.getMethodName());
    }

    public static void main(String[] args) {

        JUnitCore core = new JUnitCore();
        core.addListener(new CalculatorTestListener());

        core.run(TestSuite.class);
        core.run(CalculatorTestSuite.class);
        core.run(MathLibraryTestSuite.class);
    }
}


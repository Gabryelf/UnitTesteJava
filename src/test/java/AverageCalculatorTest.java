import org.example.program.AverageCalculator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageCalculatorTest {

    private final AverageCalculator calculator = new AverageCalculator();

    @Test
    void calculateAverageWithValidList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double result = calculator.calculateAverage(numbers);
        assertEquals(3.0, result);
    }

    @Test
    void calculateAverageWithEmptyList() {
        List<Integer> numbers = Arrays.asList();
        double result = calculator.calculateAverage(numbers);
        assertEquals(0, result);
    }

    @Test
    void calculateAverageWithNullList() {
        double result = calculator.calculateAverage(null);
        assertEquals(0, result);
    }
}


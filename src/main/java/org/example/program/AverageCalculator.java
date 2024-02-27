package org.example.program;

import java.util.List;

public class AverageCalculator {
    public double calculateAverage(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        return numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
    }
}

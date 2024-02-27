package org.example;

import org.example.program.AverageCalculator;
import org.example.program.ComparisonResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = readNumbers(scanner, "Введите числа первого списка через пробел:");
        List<Integer> secondList = readNumbers(scanner, "Введите числа второго списка через пробел:");

        AverageCalculator averageCalculator = new AverageCalculator();
        ComparisonResult comparisonResult = new ComparisonResult(
                averageCalculator.calculateAverage(firstList),
                averageCalculator.calculateAverage(secondList)
        );

        System.out.println(comparisonResult.compareAverages());
    }

    private static List<Integer> readNumbers(Scanner scanner, String prompt) {
        System.out.println(prompt);
        String[] inputNumbers = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String inputNumber : inputNumbers) {
            numbers.add(Integer.parseInt(inputNumber));
        }
        return numbers;
    }
}

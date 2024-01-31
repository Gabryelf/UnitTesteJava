package org.example.Calculator;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи
    public static double squareRootExtraction(double num) {
        //  0
        //  Отрицательные числа
        //  Дробные значения корней
        //  Целые
            if(num < 0) {
                throw new IllegalArgumentException("Cannot calculate square root of a negative number");
            }
            return Math.sqrt(num);
    }

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    //public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        //return 0; // Метод должен возвращать сумму покупки со скидкой
    //}
    public static double calculateDiscount(double purchaseAmount, int discountPercentage) {
        if (purchaseAmount < 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new ArithmeticException("Invalid input: purchaseAmount and discountPercentage must be non-negative, and discountPercentage must be between 0 and 100");
        }

        double discount = purchaseAmount * discountPercentage / 100.0;
        return purchaseAmount - discount;
    }

    @Test
    public void testCalculateDiscount() {
        // Тесты с корректными аргументами
        Assertions.assertThat(calculateDiscount(100, 10)).isEqualTo(90.0);
        Assertions.assertThat(calculateDiscount(200, 20)).isEqualTo(160.0);

        // Тесты с недопустимыми аргументами
        Assertions.assertThatThrownBy(() -> calculateDiscount(-100, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid input: purchaseAmount and discountPercentage must be non-negative, and discountPercentage must be between 0 and 100");

        Assertions.assertThatThrownBy(() -> calculateDiscount(100, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid input: purchaseAmount and discountPercentage must be non-negative, and discountPercentage must be between 0 and 100");

        Assertions.assertThatThrownBy(() -> calculateDiscount(100, 110))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid input: purchaseAmount and discountPercentage must be non-negative, and discountPercentage must be between 0 and 100");
    }
}
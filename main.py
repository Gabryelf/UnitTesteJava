from average_calculator import AverageCalculator, ComparisonResult


def main():
    first_list = [int(x) for x in input(f"Введите числа первого списка через пробел: ").split()]
    second_list = [int(x) for x in input(f"Введите числа второго списка через пробел: ").split()]

    calculator = AverageCalculator()
    first_average = calculator.calculate_average(first_list)
    second_average = calculator.calculate_average(second_list)

    result = ComparisonResult(first_average, second_average)
    print(result.compare_averages())


if __name__ == "__main__":
    main()


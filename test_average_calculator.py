import pytest

from average_calculator import AverageCalculator, ComparisonResult


@pytest.fixture
def average_calculator():
    return AverageCalculator()


def test_calculate_average(average_calculator):
    assert average_calculator.calculate_average([1, 2, 3]) == 2
    assert average_calculator.calculate_average([]) == 0


def test_comparison_result():
    result = ComparisonResult(3, 5)
    assert result.compare_averages() == "Второй список имеет большее среднее значение"
    result = ComparisonResult(5, 3)
    assert result.compare_averages() == "Первый список имеет большее среднее значение"
    result = ComparisonResult(4, 4)
    assert result.compare_averages() == "Средние значения равны"

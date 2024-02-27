class AverageCalculator:
    def calculate_average(self, numbers: list) -> float:
        """Calculate the average of a list of numbers."""
        return sum(numbers) / len(numbers) or 0

class ComparisonResult:
    def __init__(self, first_average: float, second_average: float):
        self.first_average = first_average
        self.second_average = second_average

    def compare_averages(self) -> str:
        """Compare the averages of two lists."""
        if self.first_average > self.second_average:
            return f"Первый список имеет большее среднее значение"
        elif self.first_average < self.second_average:
            return f"Второй список имеет большее среднее значение"
        else:
            return f"Средние значения равны"

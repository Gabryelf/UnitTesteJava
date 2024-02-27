package org.example.program;

public class ComparisonResult {
    private final double firstAverage;
    private final double secondAverage;

    public ComparisonResult(double firstAverage, double secondAverage) {
        this.firstAverage = firstAverage;
        this.secondAverage = secondAverage;
    }

    public String compareAverages() {
        if (firstAverage > secondAverage) {
            return "Первый список имеет большее среднее значение";
        } else if (firstAverage < secondAverage) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}


import org.example.program.ComparisonResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComparisonResultTest {

    @Test
    void compareAveragesWithFirstGreater() {
        ComparisonResult result = new ComparisonResult(5, 3);
        assertEquals("Первый список имеет большее среднее значение", result.compareAverages());
    }

    @Test
    void compareAveragesWithSecondGreater() {
        ComparisonResult result = new ComparisonResult(3, 5);
        assertEquals("Второй список имеет большее среднее значение", result.compareAverages());
    }

    @Test
    void compareAveragesWithEqualAverages() {
        ComparisonResult result = new ComparisonResult(4, 4);
        assertEquals("Средние значения равны", result.compareAverages());
    }
}


package uk.tojourn.problems;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WordValuerIntegrationTest {
    private final DynamicConverter converter = new DynamicConverter();
    private final WordValuer wordValuer = new WordValuer(converter);


    @ParameterizedTest
    @CsvSource({"bob,19", "Bob,19", "'', 0", "a,1", "a,1", "z,26", "cab,6", "excellent,100", "microspectrophotometries, 317", "!,0"})
    void getValueOf(String input, String result) {
        int resultAsInt = Integer.parseInt(result);
        assertEquals(resultAsInt, wordValuer.getValueOf(input));
    }
}

package uk.tojourn.problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DynamicConverterTest {
    private final DynamicConverter converter = new DynamicConverter();
    @ParameterizedTest
    @CsvSource({"a,1", "z,26", "1,0", ";,0", "A,0", "Z,0"})
    void convertAsciiToIndex(String input, String result) {
        char letterAsChar = input.charAt(0);
        int resultAsInt = Integer.parseInt(result);
        assertEquals(resultAsInt, converter.convertAsciiToIndex(letterAsChar));
    }
}

package uk.tojourn.problems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.CharBuffer;
import java.util.stream.IntStream;

@Service
public class WordValuer {
    private final DynamicConverter converter;

    public WordValuer(DynamicConverter converter) {
        this.converter = converter;
    }

    public int getValueOf(String word) {
        String lowercaseWord = word.toLowerCase();
        char[] charArray = lowercaseWord.toCharArray();
        return CharBuffer.wrap(charArray).chars().map(
                asciiOfLetter -> converter.convertAsciiToIndex((char)asciiOfLetter)
        ).sum();
    }


}

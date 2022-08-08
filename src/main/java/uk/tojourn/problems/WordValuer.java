package uk.tojourn.problems;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Service
public class WordValuer {
    private final Pattern pattern = Pattern.compile("[a-z]+");
    public int getValueOf(String word) {
        String lowercase = word.toLowerCase();
        Matcher matcher = pattern.matcher(lowercase);
        if (matcher.matches()) {
            //We want an index starting at one, so we are reducing the number by the starting character in ascii a=97 so -96 = 1
            return lowercase.chars().reduce(0, WordValuer::reduceLetterByValue);
        } else return 0;

    }
    private static int valueFor(char letter){
        return letter - 96;
    }

    private static int reduceLetterByValue(int accumulator, int letter){
        return accumulator + valueFor((char)letter);
    }


}

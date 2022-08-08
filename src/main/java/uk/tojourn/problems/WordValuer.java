package uk.tojourn.problems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.CharBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Service
public class WordValuer {
    private final Pattern pattern = Pattern.compile("[a-z]+");
    public int getValueOf(String word) {

        Matcher matcher = pattern.matcher(word);
        if (matcher.matches()) {
            //We want an index starting at one, so we are reducing the number by the starting character in ascii a=97 so -96 = 1
            return word.toLowerCase().chars().reduce(0, (subtotal, letter) ->
                    subtotal + valueFor((char)letter)
            );
        } else return 0;

    }
    private int valueFor(char letter){
        return letter - 96;
    }


}

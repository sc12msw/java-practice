package uk.tojourn.problems;

import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class DynamicConverter {

    private final Pattern pattern = Pattern.compile("[a-z]+");
    public int convertAsciiToIndex(char letter){
        Matcher matcher = pattern.matcher(Character.toString(letter));
        if(matcher.matches()){
            //We want an index starting at one, so we are reducing the number by the starting character in ascii a=97 so -96 = 1
            return letter - 96 ;
        }
        return 0;
    }
}

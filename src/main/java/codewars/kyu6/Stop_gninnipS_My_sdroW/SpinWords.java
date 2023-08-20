package codewars.kyu6.Stop_gninnipS_My_sdroW;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {

    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(word -> word.length() >= 5 ? new StringBuffer(word).reverse().toString() : word)
                .collect(Collectors.joining(" "));
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SubstringGenerator {
    private String word;
    public SubstringGenerator(String word) {
        this.word = word;
    }

    public List<String> getAllSubstrings() {
        List<String> substrings = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                substrings.add(word.substring(i, j));
            }
        }

        Collections.sort(substrings, Comparator.comparingInt(String::length));

        return substrings;
    }
}

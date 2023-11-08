package DemoLamda;

import java.util.Arrays;
import java.util.List;

public class AdvanceStream {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        // Calculate the total number of characters in all words
        int totalCharacters = words.stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                .reduce(0, (subtotal, character) -> subtotal + 1, Integer::sum);

        System.out.println("Total characters in all words: " + totalCharacters);
    }
}

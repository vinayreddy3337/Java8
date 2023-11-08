package DemoLamda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "David", "Alex", "Beth");

        // Grouping names by the first letter and counting
        Map<Character, Long> letterCount = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0), Collectors.counting()));

        System.out.println("Count of names by first letter: " + letterCount);
    }
}

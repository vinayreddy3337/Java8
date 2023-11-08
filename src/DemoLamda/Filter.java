package DemoLamda;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "David");

        // Using Stream and Lambda expression to filter names starting with 'A'
        List<String> filteredNames = names.stream().filter(name -> name.startsWith("A")).toList();

        System.out.println("Names starting with 'A': " + filteredNames);
    }
}

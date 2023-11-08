package DemoLamda;

import java.util.Arrays;
import java.util.List;

public class Streams2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using Stream and Lambda expression to calculate the sum
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Sum of Numbers: " + sum);
    }
}

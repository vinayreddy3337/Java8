package DemoLamda;

import java.util.ArrayList;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Using Lambda expression to filter even numbers
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).toList();

        System.out.println("Even Numbers: " + evenNumbers);
    }
}

package DemoLamda;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysStream {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        IntStream stm = Arrays.stream(arr);

        stm.forEach(a -> System.out.print(a + " "));
    }
}

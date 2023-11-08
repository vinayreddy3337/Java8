package DemoLamda;

import java.util.Arrays;
import java.util.List;

public class Sequential_Stream {

    public static void main(String[] args) {

        List<String> list = Arrays.asList( "Hello ",
                "G", "E", "E", "K", "S!");

        list.stream().forEach(n -> System.out.print(n));
    }
}

package DemoLamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {


        List<Integer> number= Arrays.asList(10,29,10,484,29,23);


        int first= number.stream().findFirst().get();
        System.out.print(first);



    }
}

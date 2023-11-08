package DemoLamda;

import java.util.Arrays;
import java.util.List;

public class Demo3 {

    public static void main(String[] args) {


        List<Integer> number= Arrays.asList(10,29,10,484,29,23);

        number.stream().sorted().forEach(n -> System.out.print( " " +n));

        System.out.println();

    }
}

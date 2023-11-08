package DemoLamda;

import java.util.Arrays;
import java.util.List;

public class Demo2 {


    public static void main(String[] args) {

        List<Integer> number= Arrays.asList(10,29,10,484,29,23);

        //printing Distinct(unique numbers)
        number.stream().distinct().forEach(n -> System.out.print(" " + n));

        System.out.println();
        //Even Number
        number.stream().filter(n -> n%2==0).forEach(x -> System.out.print(" " + x ));
        System.out.println();

        //limits the number by 4
        number.stream().limit(3).forEach(n -> System.out.print(" " + n));

    }
}

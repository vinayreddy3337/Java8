package DemoLamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Functional_Streams1 {

    public static void main(String[] args) {


        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> result=numbers.stream()
                .filter(n -> n%2==0)
             //   .map(n -> n*n)
                .collect(Collectors.toList());

        System.out.println(result);




    }
}

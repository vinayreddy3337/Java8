package DemoLamda;


import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Functional_Streams {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(19);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Create a stream from the list
        Stream<Integer> numberStream = numbers.stream();

        // Filter the stream to get even numbers
        Stream<Integer> evenNumbers = numberStream.filter(n -> n % 2 == 0);

        // Map the even numbers to their squares
        Stream<Integer> squaredNumbers = evenNumbers.map(n -> n * n);

        // Collect the squared numbers into a new list
        List<Integer> squaredNumbersList = squaredNumbers.collect(Collectors.toList());

        // Print the squared numbers
        System.out.println("Squared Numbers: " + squaredNumbersList);



    }








}


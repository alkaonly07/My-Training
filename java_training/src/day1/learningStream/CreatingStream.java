package day1.learningStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {
        // From a Collection
        List<String> list = Arrays.asList("apple", "banana", "orange");
        Stream<String> streamFromList = list.stream();

        // From an Array
        String[] array = {"one", "two", "three"};
        Stream<String> streamFromArray = Arrays.stream(array);

        // Using Stream.of()
        Stream<String> streamOfElements = Stream.of("dog", "cat", "bird");

        // Empty Stream
        Stream<String> emptyStream = Stream.empty();
    }
}

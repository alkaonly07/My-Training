package day1.learningStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperation {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "mango");

        // Filter elements
        List<String> filteredFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("a"))
                .collect(Collectors.toList());

        // Transform elements
        List<String> uppercasedFruits = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // FlatMap (useful for handling nested collections)
        List<String> nestedWords = Arrays.asList("java", "stream", "api");
        List<String> flatMapResult = nestedWords.stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                .collect(Collectors.toList());
    }
}

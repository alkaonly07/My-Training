package day1.learningStream;

import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //Empty stream
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e ->
        {
            System.out.println(e);
        });
        String[] names={"Nisha", "Shubham", "Mohit"};
        Stream<String> stream=Stream.of(names);
        stream.forEach(System.out::println);

    }
}

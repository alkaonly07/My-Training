package day1.learningStream;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sequential Stream
        long sequentialTime = System.currentTimeMillis();
        long sequentialSum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sequential Sum: " + sequentialSum);
        System.out.println("Sequential Time: " + (System.currentTimeMillis() - sequentialTime) + "ms");

        // Parallel Stream
        long parallelTime = System.currentTimeMillis();
        long parallelSum = numbers.parallelStream().reduce(0, Integer::sum);
        System.out.println("Parallel Sum: " + parallelSum);
        System.out.println("Parallel Time: " + (System.currentTimeMillis() - parallelTime) + "ms");
    }
}

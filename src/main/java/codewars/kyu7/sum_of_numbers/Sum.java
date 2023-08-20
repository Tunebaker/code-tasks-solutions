package codewars.kyu7.sum_of_numbers;

import java.util.stream.IntStream;

public class Sum {
    public int getSum(int a, int b) {
        return a == b ? a : IntStream.rangeClosed(Math.min(a, b), Math.max(a, b)).sum();
    }
}

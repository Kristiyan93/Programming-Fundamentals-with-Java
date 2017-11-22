package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class H_CountNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays
                .stream(reader.readLine().split(" "))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        numbers.sort((a, b) -> a.compareTo(b));
        Integer counter = 1;

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) == numbers.get(i + 1)) {
                counter++;

                if (i == numbers.size() - 2) {
                    System.out.println(numbers.get(i) + " -> " + counter);
                }
            } else {
                System.out.println(numbers.get(i) + " -> " + counter);
                counter = 1;
            }
        }
    }
}

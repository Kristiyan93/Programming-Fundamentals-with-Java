package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A_MaxSequenceOfEqualElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays
                .stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();
        Integer counter = 1;

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) == numbers.get(i + 1)) {
                counter++;
                if (i < numbers.size() - 2) {
                    continue;
                }
            }
            if (result.size() < counter) {
                result.clear();

                for (int j = 0; j < counter; j++) {
                    result.add(numbers.get(i));
                }
            }
            counter = 1;
        }

        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
    }
}

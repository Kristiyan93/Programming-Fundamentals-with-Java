package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C_SearchForANumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> elements = Arrays
                .stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int[] numbers = Arrays
                .stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> result = new ArrayList<>();

        Integer getElements = numbers[0];
        Integer deleteElements = numbers[1];
        Integer searchDigit = numbers[2];

        for (int i = 0; i < getElements; i++) {
            result.add(elements.get(i));
        }
        for (int i = 0; i < deleteElements; i++) {
            result.remove(0);

        }

        for (Integer integer : result) {
            if (searchDigit == integer) {
                System.out.println("YES!");
                return;
            }
        }

        System.out.println("NO!");
    }
}

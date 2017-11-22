package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class B_ChangeList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays
                .stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] input = reader.readLine().split("\\s");

        while (!input[0].equals("Odd") &&
                !input[0].equals("Even")) {
            if (input[0].equals("Delete")) {
                numbers.removeAll(Collections.singleton(getElement(input)));
            }
            if (input[0].equals("Insert")) {
                numbers.add(getPosition(input), getElement(input));
            }

            input = reader.readLine().split("\\s");
        }

        if (input[0].equals("Odd")) {
            for (Integer number : numbers) {
                if (number % 2 != 0) {
                    System.out.printf("%d ", number);
                }
            }
        }

        if (input[0].equals("Even")) {
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    System.out.printf("%d ", number);
                }
            }
        }
    }

    private static Integer getPosition(String[] input) {
        Integer position = 0;
        try {
            position = Integer.parseInt(input[2]);
        } catch (Exception e) { }
        return position;
    }

    private static int getElement(String[] input) {
        Integer digit = 0;
        try {
            digit = Integer.parseInt(input[1]);
        } catch (Exception e) { }
        return digit;
    }
}

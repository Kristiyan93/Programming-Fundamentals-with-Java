package MoreExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A_ArrayData {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> elements = Arrays
                .stream(reader.readLine().split(" "))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        String command = reader.readLine();

        Double avg = elements.stream().mapToDouble(Double::valueOf).average().getAsDouble();

        if (command.equals("Min")) {
            System.out.println(elements.stream()
                    .filter(n -> n >= avg)
                    .mapToInt(Integer::valueOf)
                    .min().getAsInt());
        } else if (command.equals("Max")) {
            System.out.println(elements.stream()
                    .filter(n -> n >= avg)
                    .mapToInt(Integer::valueOf)
                    .max().getAsInt());
        } else {
            System.out.println(elements.stream()
                    .filter(n -> n > avg)
                    .sorted(Integer::compareTo)
                    .map(Object::toString)
                    .collect(Collectors.joining(" ")));
        }
    }
}

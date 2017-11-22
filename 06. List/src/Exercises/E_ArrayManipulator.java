package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E_ArrayManipulator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> elements = Arrays
                .stream(reader.readLine().split("\\s"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = reader.readLine();

        while (!input.equals("print")) {
            String[] tokens = input.split("\\s");
            int index;
            int element;
            int position;
            List<Integer> addElements = new ArrayList<>();

            switch (tokens[0]) {
                case "add":
                    index = getIndex(tokens);
                    element = getElement(tokens);

                    elements.add(index, element);
                    break;
                case "addMany":
                    index = getIndex(tokens);
                    addElements = getElements(tokens);

                    elements.addAll(index, addElements);
                    break;
                case "contains":
                    position = getIndex(tokens);
                    if (!elements.contains(position)) {
                        System.out.println(-1);
                    }
                    for (int i = 0; i < elements.size(); i++) {
                        if (position == elements.get(i)) {
                            System.out.println(i);
                        }
                    }
                    break;
                case "remove":
                    index = getIndex(tokens);

                    elements.remove(index);
                    break;
                case "shift":
                    position = getIndex(tokens);

                    for (int i = 0; i < position; i++) {
                        elements.add(elements.get(i));
                    }

                    for (int i = 0; i < position; i++) {
                        elements.remove(i);
                    }
                    break;
                case "sumPairs":
                    for (int i = 0; i < elements.size(); i++) {
                        elements.add(i,elements.get(i) + elements.get(i + 1));
                        elements.remove(i + 1);
                        elements.remove(i + 1);
                    }
                    break;
            }

            input = reader.readLine();
        }

        System.out.println(elements.toString());
    }

    private static List<Integer> getElements(String[] tokens) {
        List<Integer> elements = new ArrayList<>();

        for (int i = 2; i < tokens.length; i++) {
            elements.add(Integer.parseInt(tokens[i]));
        }

        return elements;
    }

    private static int getElement(String[] tokens) {
        int digit = Integer.parseInt(tokens[2]);

        return digit;
    }

    private static int getIndex(String[] tokens) {
        int digit = digit = Integer.parseInt(tokens[1]);

        return digit;
    }
}

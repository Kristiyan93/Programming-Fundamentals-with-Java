package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class A_RemoveNegativesAndReverse {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> elements = Arrays
                .stream(reader.readLine().split(" "))
                .map(Integer::valueOf)
                .collect(Collectors.toList());


        for (int i = 0; i < elements.size(); i++) {
            Integer element = elements.get(i);

            if (element < 0) {
                elements.remove(elements.get(i));
                i--;
            }
        }

        Collections.reverse(elements);

        if (elements.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println(elements.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}

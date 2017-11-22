package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class F_SquareNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays
                .stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> squareNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (Math.sqrt(number) == (int)Math.sqrt(number)) {
                squareNumbers.add(number);
            }
        }

        squareNumbers.sort((a, b) -> a.compareTo(b));
        Collections.reverse(squareNumbers);

        System.out.println(squareNumbers.toString().replaceAll("[\\[\\],]", ""));
    }
}

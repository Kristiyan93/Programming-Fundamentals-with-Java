package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E_SquareNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> result = Arrays
                .stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        result.sort((a, b) -> a.compareTo(b));

        for (int i = 0; i < result.size(); i++) {
            if (i == result.size() - 1) {
                System.out.printf("%d%n", result.get(i));
            } else {
                System.out.printf("%d <= ", result.get(i));
            }
        }
    }
}

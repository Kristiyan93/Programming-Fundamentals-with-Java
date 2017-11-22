package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B_Largest3Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays
                .stream(reader.readLine().split("\\s"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers.stream().sorted((a, b) -> b.compareTo(a)).limit(3).forEach(x -> System.out.printf("%d ", x));
    }
}

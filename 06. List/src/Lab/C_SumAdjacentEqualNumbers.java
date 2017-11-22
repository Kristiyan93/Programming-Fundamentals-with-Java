package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C_SumAdjacentEqualNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> result = Arrays
                .stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        for (int i = 0; i < result.size() - 1; i++) {
            if (result.get(i) == result.get(i + 1)) {
                result.add(i,result.get(i) + result.get(i + 1));
                result.remove(i + 1);
                result.remove(i + 1);
                i = -1;
            }
        }

        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
    }
}

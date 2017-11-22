package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class D_FoldAndSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays
                .stream(reader.readLine().split(" "))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        Integer k = numbers.size() / 4;

        List<Integer> left = numbers
                .stream().limit(k)
                .collect(Collectors
                        .toList());
        Collections.reverse(left);

        List<Integer> right = numbers
                .stream()
                .skip(3 * k)
                .limit(k)
                .collect(Collectors.toList());
        Collections.reverse(right);

        List<Integer> center = numbers
                .stream()
                .skip(k)
                .limit(2 * k)
                .collect(Collectors.toList());

        left.addAll(right);

        for (int i = 0; i < center.size(); i++) {
            center.set(i, center.get(i) + left.get(i));
        }

        System.out.println(center
                .stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}

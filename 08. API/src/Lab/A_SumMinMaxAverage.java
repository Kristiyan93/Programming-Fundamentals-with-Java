package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A_SumMinMaxAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        List<Integer> list = new ArrayList<>();

        for (int number : numbers) {
            list.add(number);
        }

        Integer sum = Arrays.stream(numbers).sum();
        Integer min = list.stream().min(Integer::compareTo).get();
        Integer max = list.stream().max(Integer::compareTo).get();
        Double avg = list.stream().mapToDouble(Double::valueOf).average().getAsDouble();

        System.out.println("Sum = " + sum);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Average = " + avg);
    }
}

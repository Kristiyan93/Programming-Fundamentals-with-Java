package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class G_PrimesInGivenRange {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer start = Integer.parseInt(reader.readLine());
        Integer end = Integer.parseInt(reader.readLine());

        List<Integer> list = new ArrayList<>();

        list.addAll(findPrimesInRange(start, end));

        System.out.println(list);
    }

    private static List<Integer> findPrimesInRange(Integer start, Integer end) {
        List<Integer> numbers = new ArrayList<>();
        for (int num = start; num <= end; num++) {
            if (num < 2) {
                continue;
            }
            if (num == 2) {
                numbers.add(num);
            }
            if (num % 2 == 0) {
                continue;
            }
            for (int i = 3; i * i <= num; i += 2) {
                if (num % i != 0) {
                    numbers.add(num);
                } else {
                    continue;
                }
            }
            numbers.add(num);
        }
        return numbers;
    }
}

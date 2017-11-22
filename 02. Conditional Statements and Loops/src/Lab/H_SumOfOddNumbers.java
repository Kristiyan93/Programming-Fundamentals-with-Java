package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class H_SumOfOddNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        Integer sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println(i * 2 - 1);
            sum += i * 2 - 1;
        }

        System.out.printf("Sum: %d", sum);
    }
}

package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L_TestNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());
        Integer m = Integer.parseInt(reader.readLine());
        Integer maxNumber = Integer.parseInt(reader.readLine());

        Integer sum = 0;
        Integer combinations = 0;

        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <= m; j++) {
                sum += 3 * (i * j);
                combinations++;

                if (sum >= maxNumber) {
                    System.out.printf("%d combinations%nSum: %d >= %d", combinations, sum, maxNumber);
                    return;
                }
            }
        }

        System.out.printf("%d combinations%nSum: %d", combinations, sum);
    }
}

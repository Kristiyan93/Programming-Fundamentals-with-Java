package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class K_5DifferentNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer num1 = Integer.parseInt(reader.readLine());
        Integer num2 = Integer.parseInt(reader.readLine());

        if (Math.abs(num1 - num2) < 5) {
            System.out.println("No");
            return;
        }

        for (int i = num1; i < num2; i++) {
            for (int j = i + 1; j <= num2; j++) {
                for (int k = j + 1; k <= num2; k++) {
                    for (int l = k + 1; l <= num2; l++) {
                        for (int m = l + 1; m <= num2; m++) {
                            System.out.printf("%d %d %d %d %d%n", i, j, k, l, m);
                        }
                    }
                }
            }
        }
    }
}

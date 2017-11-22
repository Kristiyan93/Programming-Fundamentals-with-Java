package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class K_OddNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        if (n < 0) {
            n = Math.abs(n);
        }

        while (n % 2 == 0) {
            System.out.println("Please write an odd number.");

            n = Integer.parseInt(reader.readLine());
        }

        System.out.printf("The number is: %d", n);
    }
}

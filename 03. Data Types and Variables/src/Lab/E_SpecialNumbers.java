package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_SpecialNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= n; i++) {
            int sumOfDigits = 0;
            int digits = i;

            while (digits > 0) {
                sumOfDigits += digits % 10;
                digits /= 10;
            }

            boolean specialNum = (sumOfDigits == 5) || (sumOfDigits == 7)
                    || (sumOfDigits == 11);

            System.out.printf("%d -> %s%n", i, specialNum);
        }
    }
}

package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_SignOfIntegerNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer digit = Integer.parseInt(reader.readLine());

        printSign(digit);
    }
    public static void printSign(Integer digit) {
        if (digit > 0) {
            System.out.printf("The number %d is positive.", digit);
            return;
        }
        if (digit < 0) {
            System.out.printf("The number %d is negative.", digit);
            return;
        } else {
            System.out.printf("The number %d is zero.", digit);
        }
    }
}

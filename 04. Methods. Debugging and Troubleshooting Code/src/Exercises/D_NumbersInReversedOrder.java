package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_NumbersInReversedOrder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num = reader.readLine();

        System.out.println(getReversed(num));
    }

    private static String getReversed(String num) {
        String reversed = new StringBuilder(num).reverse().toString();

        return reversed;
    }
}

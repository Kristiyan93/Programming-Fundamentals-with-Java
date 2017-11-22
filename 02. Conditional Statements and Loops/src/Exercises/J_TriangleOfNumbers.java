package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J_TriangleOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer num = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= num; i++) {
            String digit = String.valueOf(i);
            System.out.println(newString(digit, i));
        }
    }

    private static String newString(String digit, int i1) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < i1; i++) {
            sb.append(i1 + " ");
        }

        return sb.toString();
    }
}

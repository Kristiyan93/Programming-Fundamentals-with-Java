package MoreExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_X {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        if (n % 2 == 0) {
            return;
        }

        for (int i = 0; i < n / 2; i++) {
            System.out.println(newString(" ", i) + "x" + newString(" ", n - 2 - i - i) + "x");
        }

        System.out.println(newString(" ", n / 2) + "x");

        for (int i = n / 2 - 1; i >= 0; i--) {
            System.out.println(newString(" ", i) + "x" + newString(" ", n - 2 - i - i) + "x");
        }
    }
    public static String newString(String str, Integer count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }

        return sb.toString();
    }
}

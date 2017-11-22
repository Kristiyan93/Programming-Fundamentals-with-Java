package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_IntervalOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer a = Integer.parseInt(reader.readLine());
        Integer b = Integer.parseInt(reader.readLine());

        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }
        if (a > b) {
            for (int i = b; i <= a; i++) {
                System.out.println(i);
            }
        }
    }
}

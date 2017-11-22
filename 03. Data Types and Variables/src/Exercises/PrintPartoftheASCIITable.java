package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintPartoftheASCIITable {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer a = Integer.parseInt(reader.readLine());
        Integer b = Integer.parseInt(reader.readLine());

        for (int i = a; i <= b; i++) {
            Character letter = (char) i;
            if (i == b) {
                System.out.printf("%c", letter);
            } else {
                System.out.printf("%c ", letter);
            }
        }
    }
}

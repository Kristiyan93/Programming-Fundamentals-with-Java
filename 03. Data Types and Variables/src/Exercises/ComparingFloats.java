package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComparingFloats {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Double a = Double.parseDouble(reader.readLine());
        Double b = Double.parseDouble(reader.readLine());

        Double result = Math.abs(a - b);

        if (result < 0.000001) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_MilesToKilometers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Double miles = Double.parseDouble(reader.readLine());

        System.out.printf("%.2f", miles * 1.60934);
    }
}

package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_RectangleArea {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Double w = Double.parseDouble(reader.readLine());
        Double h = Double.parseDouble(reader.readLine());

        Double rectangle = w * h;

        System.out.printf("%.2f", rectangle);
    }
}

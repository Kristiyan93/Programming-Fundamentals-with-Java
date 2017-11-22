package MoreExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class C_Megapixels {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Double width = Double.parseDouble(reader.readLine());
        Double height = Double.parseDouble(reader.readLine());

        Double megapixels = ((width * height) / 1000000.0);

        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println(df.format(width) + "x" + df.format(height) + " => " + String.format("%.1fMP", megapixels));
    }
}

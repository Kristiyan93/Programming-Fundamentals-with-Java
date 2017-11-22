package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class F_CalculateTriangleArea {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Double width = Double.parseDouble(reader.readLine());
        Double height = Double.parseDouble(reader.readLine());

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println(df.format(calculateTriangleArea(width, height)));
    }
    public static Double calculateTriangleArea(Double a, Double b) {
        return a * b / 2.0;
    }
}

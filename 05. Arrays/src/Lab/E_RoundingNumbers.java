package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;

public class E_RoundingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double[] arr = Arrays
                .stream(reader.readLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                double num = Math.round(arr[i]);
                DecimalFormat df = new DecimalFormat("0.##");
                System.out.println(df.format(arr[i]) + " => " + df.format(num));
            } else {
                double num = Math.round(Math.abs(arr[i]));
                DecimalFormat df = new DecimalFormat("0.##");
                System.out.println(df.format(arr[i]) + " => -" + df.format(num));
            }
        }
    }
}

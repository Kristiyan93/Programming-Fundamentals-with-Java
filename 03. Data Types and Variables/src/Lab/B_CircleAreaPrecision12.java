package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CircleAreaPrecision12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Double r = Double.parseDouble(reader.readLine());

        System.out.printf("%.12f", Math.PI * r * r);
    }
}

package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_TemperatureConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Double fahrenheit = Double.parseDouble(reader.readLine());

        System.out.printf("%.2f", fahrenheitToCelsius(fahrenheit));
    }
    public static Double fahrenheitToCelsius(Double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}

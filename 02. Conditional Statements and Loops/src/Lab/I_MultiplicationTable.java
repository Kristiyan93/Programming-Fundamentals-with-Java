package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_MultiplicationTable {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer digit = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", digit, i, digit * i);
        }
    }
}

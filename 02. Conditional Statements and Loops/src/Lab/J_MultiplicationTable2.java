package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J_MultiplicationTable2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer digit = Integer.parseInt(reader.readLine());
        Integer times = Integer.parseInt(reader.readLine());

        if (times > 10) {
            System.out.printf("%d X %d = %d%n", digit, times, digit * times);
        } else {
            for (int i = times; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", digit, i, digit * i);
            }
        }
    }
}

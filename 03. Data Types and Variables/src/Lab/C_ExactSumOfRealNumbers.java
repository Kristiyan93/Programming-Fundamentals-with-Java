package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class C_ExactSumOfRealNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        BigDecimal result = new BigDecimal(0);

        for (int i = 0; i < n; i++) {
            BigDecimal test = new BigDecimal(reader.readLine());
            result = result.add(test);
        }

        System.out.println(result);
    }
}

package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_AddTwoNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer sideA = Integer.parseInt(reader.readLine());
        Integer sideB = Integer.parseInt(reader.readLine());

        Integer result = sideA + sideB;

        System.out.printf("%d + %d = %d", sideA, sideB, result);
    }
}

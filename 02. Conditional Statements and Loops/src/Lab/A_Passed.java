package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Passed {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Double grade = Double.parseDouble(reader.readLine());

        if (grade >= 3) {
            System.out.println("Passed!");
        }
    }
}

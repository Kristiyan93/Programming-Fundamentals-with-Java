package Lab;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L_NumberChecker {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            Integer num = Integer.parseInt(reader.readLine());
            System.out.println("It is a number.");
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }
}

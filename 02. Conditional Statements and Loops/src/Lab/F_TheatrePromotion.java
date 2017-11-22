package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_TheatrePromotion {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        Integer age = Integer.parseInt(reader.readLine());

        if (input.equals("Weekday")) {
            if ((age >= 0 && age <= 18) ||
                    (age > 64 && age <= 122)) {
                System.out.println("12$");
                return;
            }
            if (age > 18 && age <= 64) {
                System.out.println("18$");
                return;
            } else {
                System.out.println("Error!");
            }
        }
        if (input.equals("Weekend")) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                System.out.println("15$");
                return;
            }
            if (age > 18 && age <= 64) {
                System.out.println("20$");
                return;
            } else {
                System.out.println("Error!");
            }
        }
        if (input.equals("Holiday")) {
            if (age >= 0 && age <= 18) {
                System.out.println("5$");
                return;
            }
            if (age > 18 && age <= 64) {
                System.out.println("12$");
                return;
            }
            if (age > 64 && age <= 122) {
                System.out.println("10$");
                return;
            } else {
                System.out.println("Error!");
            }
        }
    }
}

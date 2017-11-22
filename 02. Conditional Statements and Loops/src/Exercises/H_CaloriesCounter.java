package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class H_CaloriesCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        Integer cheese = 500;
        Integer tomato = 150;
        Integer salami = 600;
        Integer pepper = 50;

        Integer totalCalories = 0;

        for (int i = 0; i < n; i++) {
            String product = reader.readLine();

            if (product.equalsIgnoreCase("cheese")) {
                totalCalories += cheese;
            }
            if (product.equalsIgnoreCase("tomato sauce")) {
                totalCalories += tomato;
            }
            if (product.equalsIgnoreCase("salami")) {
                totalCalories += salami;
            }
            if (product.equalsIgnoreCase("pepper")) {
                totalCalories += pepper;
            }
        }

        System.out.println("Total calories: " + totalCalories);
    }
}

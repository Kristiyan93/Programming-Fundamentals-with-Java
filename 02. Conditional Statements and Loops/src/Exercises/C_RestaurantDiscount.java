package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_RestaurantDiscount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer groupSize = Integer.parseInt(reader.readLine());
        String input = reader.readLine();

        if (groupSize <= 50) {
            String hallName = "Small Hall";
            double price = 2500;
            double discount = 0;

            if (input.equals("Normal")) {
                discount = 5;
                price += 500;

            }
            if (input.equals("Gold")) {
                discount = 10;
                price += 750;
            }
            if (input.equals("Platinum")) {
                discount = 15;
                price += 1000;
            }

            Double disPrice = price * (discount / 100.0);
            double total = (price - disPrice) / groupSize;

            System.out.printf("We can offer you the %s%n", hallName);
            System.out.printf("The price per person is %.2f$", total);
            return;
        }

        if (groupSize <= 100) {
            String hallName = "Terrace";
            double price = 5000;
            double discount = 0;

            if (input.equals("Normal")) {
                discount = 5;
                price += 500;

            }
            if (input.equals("Gold")) {
                discount = 10;
                price += 750;
            }
            if (input.equals("Platinum")) {
                discount = 15;
                price += 1000;
            }

            Double disPrice = price * (discount / 100.0);
            double total = (price - disPrice) / groupSize;

            System.out.printf("We can offer you the %s%n", hallName);
            System.out.printf("The price per person is %.2f$", total);
            return;
        }

        if (groupSize <= 120) {
            String hallName = "Great Hall";
            double price = 7500;
            double discount = 0;

            if (input.equals("Normal")) {
                discount = 5;
                price += 500;

            }
            if (input.equals("Gold")) {
                discount = 10;
                price += 750;
            }
            if (input.equals("Platinum")) {
                discount = 15;
                price += 1000;
            }

            Double disPrice = price * (discount / 100.0);
            double total = (price - disPrice) / groupSize;

            System.out.printf("We can offer you the %s%n", hallName);
            System.out.printf("The price per person is %.2f$", total);
            return;
        } else {
            System.out.println("We do not have an appropriate hall.");
        }
    }
}

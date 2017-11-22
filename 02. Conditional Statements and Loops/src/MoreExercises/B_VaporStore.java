package MoreExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_VaporStore {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Double balance = Double.parseDouble(reader.readLine());
        String input = reader.readLine();

        Double price = 0d;
        Double totalSpent = 0d;

        while (!input.equalsIgnoreCase("Game Time")) {
            switch (input) {
                case "OutFall 4":
                    price = 39.99;
                    if (price > balance) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= price;
                        totalSpent += price;

                        System.out.println("Bought " + input);
                    }
                    break;
                case "CS: OG":
                    price = 15.99;
                    if (price > balance) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= price;
                        totalSpent += price;

                        System.out.println("Bought " + input);
                    }
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    if (price > balance) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= price;
                        totalSpent += price;

                        System.out.println("Bought " + input);
                    }
                    break;
                case "Honored 2":
                    price = 59.99;
                    if (price > balance) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= price;
                        totalSpent += price;

                        System.out.println("Bought " + input);
                    }
                    break;
                case "RoverWatch":
                    price = 29.99;
                    if (price > balance) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= price;
                        totalSpent += price;

                        System.out.println("Bought " + input);
                    }
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    if (price > balance) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= price;
                        totalSpent += price;

                        System.out.println("Bought " + input);
                    }
                    break;
                    default:
                        System.out.println("Not Found");
                        break;
            }

            if (balance <= 0) {
                System.out.println("Out of money!");
                return;
            }

            input = reader.readLine();
        }

        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, balance);
    }
}

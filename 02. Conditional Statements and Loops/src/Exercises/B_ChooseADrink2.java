package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_ChooseADrink2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        Integer quantity = Integer.parseInt(reader.readLine());

        switch (input) {
            case "Athlete":
                System.out.printf("The %s has to pay %.2f.", input, quantity * 0.7);
                break;
            case "Businessman":
            case "Businesswoman":
                System.out.printf("The %s has to pay %.2f.", input, quantity * 1.0);
                break;
            case "SoftUni Student":
                System.out.printf("The %s has to pay %.2f.", input, quantity * 1.7);
                break;
           default:
               System.out.printf("The %s has to pay %.2f.", input, quantity * 1.2);
                break;
        }
    }
}

package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G_CakeIngredients {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        Integer count = 0;

        while (!input.equals("Bake!")) {
            System.out.printf("Adding ingredient %s.%n", input);
            count++;

            input = reader.readLine();
        }

        System.out.printf("Preparing cake with %d ingredients.", count);
    }
}

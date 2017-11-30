package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//83/100

public class A_FindTheLetter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();
        String[] tokens = reader.readLine().split("\\s");
        String letter = tokens[0];
        Character symbol = letter.charAt(0);
        Integer counter = Integer.parseInt(tokens[1]);

        Integer currentPosition = 0;
        Integer currentCounter = 0;

        for (int i = 0; i < text.length(); i++) {
            Character currentLeter = text.charAt(i);

            if (currentLeter.equals(symbol)) {
                currentCounter++;
                currentPosition = text.lastIndexOf(symbol);
            }
        }

        if (counter == currentCounter) {
            System.out.println(currentPosition);
        }

        if (counter != currentCounter) {
            System.out.println("Find the letter yourself!");
        }
    }
}

package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_FindTheLetter1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();
        String[] tokens = reader.readLine().split(" ");

        String letter = tokens[0];
        Integer skippedInex = Integer.parseInt(tokens[1]);

        Integer index = -1;

        for (int i = 0; i < skippedInex; i++) {
            index = text.indexOf(letter, index + 1);
        }

        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("Find the letter yourself!");
        }
    }
}

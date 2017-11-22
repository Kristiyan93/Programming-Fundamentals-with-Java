package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_MagicLetter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Character firstLetter = reader.readLine().charAt(0);
        Character secondLetter = reader.readLine().charAt(0);
        Character skipLetter = reader.readLine().charAt(0);

        for (Character i = firstLetter; i <= secondLetter; i++) {
            for (Character j = firstLetter; j <= secondLetter; j++) {
                for (Character k = firstLetter; k <= secondLetter; k++) {
                    if (i.equals(skipLetter) || j.equals(skipLetter) || k.equals(skipLetter)) {
                        continue;
                    } else {
                        System.out.printf("%c%c%c ", i, j, k);
                    }
                }
            }
        }
    }
}

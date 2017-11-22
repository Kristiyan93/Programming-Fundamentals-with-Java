package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_LargestCommonEnd {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] fistInput = reader.readLine().split(" ");
        String[] secondInput = reader.readLine().split(" ");

        Integer counterL = 0;
        Integer counterR = 0;
        Integer mintLength = Math.min(fistInput.length, secondInput.length);

        for (int i = 0; i < mintLength; i++) {
            if (fistInput[i].equalsIgnoreCase(secondInput[i])) {
                counterL++;
            }
            if (fistInput[fistInput.length - i - 1].equalsIgnoreCase(secondInput[secondInput.length - 1 - i])) {
                counterR++;
            }
        }

        if (counterL >= counterR) {
            System.out.println(counterL);
        }
        if (counterL < counterR) {
            System.out.println(counterR);
        }
    }
}

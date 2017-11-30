package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class F_SentenceSplit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();
        String delimiter =reader.readLine();

        String[] tokens = text.split(delimiter);

        System.out.println(Arrays.asList(tokens));
    }
}

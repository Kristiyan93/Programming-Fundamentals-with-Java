package Exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I_CountTheIntegers {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer counter = 0;

        while (true) {
            try {
                Integer digit = Integer.parseInt(reader.readLine());
                counter++;
            } catch (Exception e) {
                System.out.println(counter);
                return;
            }
        }
    }
}

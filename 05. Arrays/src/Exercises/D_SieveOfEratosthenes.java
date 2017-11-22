package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_SieveOfEratosthenes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer num = Integer.parseInt(reader.readLine());

        boolean[] priems = new boolean[num + 1];

        for (int i = 0; i < priems.length; i++) {
            priems[i] = true;
        }

        priems[0] = priems[1] = false;

        for (int i = 0; i <= num; i++) {
            if (!priems[i]) {
                continue;
            }

            System.out.print(i + " ");

            for (int p = 2 * i; p <= num; p+=i) {
                priems[p] = false;
            }
        }
        System.out.println();
    }
}

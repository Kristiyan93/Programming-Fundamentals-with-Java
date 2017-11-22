package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M_GameOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());
        Integer m = Integer.parseInt(reader.readLine());
        Integer magic = Integer.parseInt(reader.readLine());

        Integer combinations = 0;

        for (int i = n; i <= m; i++) {
            for (int j = n; j <= m; j++) {

                if (i + j == magic) {
                    System.out.printf("Number found! %d + %d = %d", j, i, magic);
                    return;
                } else {
                    combinations++;
                }
            }
        }

        System.out.printf("%d combinations - neither equals %d", combinations, magic);
    }
}

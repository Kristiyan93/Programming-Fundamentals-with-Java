package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_MaxMethod {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer a = Integer.parseInt(reader.readLine());
        Integer b = Integer.parseInt(reader.readLine());
        Integer c = Integer.parseInt(reader.readLine());

        getMax(a, b, c);
    }

    private static void getMax(Integer a, Integer b, Integer c) {
        if (a >=b && a >=c) {
            System.out.println(a);
        }
        if (b >= a && b >= c) {
            System.out.println(b);
        }
        if (c >= b && c >= a) {
            System.out.println(c);
        }
    }
}

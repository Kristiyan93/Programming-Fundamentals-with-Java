package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_DrawAFilledSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        System.out.println(newString("-", n * 2));

        for (int i = 0; i < n - 2; i++) {
            System.out.println("-" + newString("\\/", n -1) + "-");
        }

        System.out.println(newString("-", n * 2));
    }
    public static String newString(String letter, Integer count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(letter);
        }

        return sb.toString();
    }
}

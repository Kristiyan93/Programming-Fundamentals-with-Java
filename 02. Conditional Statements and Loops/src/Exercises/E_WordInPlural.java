package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_WordInPlural {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        if (input.endsWith("y")) {
            input = input.replace("y", "ies");
            System.out.println(input);
            return;
        }
        if (input.endsWith("o") || input.endsWith("ch") ||
                input.endsWith("s") || input.endsWith("sh") || input.endsWith("x")
                || input.endsWith("z")) {
            input += "es";
            System.out.println(input);
            return;
        } else {
            input += "s";
            System.out.println(input);
        }
    }
}

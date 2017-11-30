package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_TextFilter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] patterns = reader.readLine().trim().split(", ");
        String text = reader.readLine();

        for (String pattern : patterns) {
            text = text.replaceAll(pattern, newString("*", pattern.length()));
        }

        System.out.println(text);
    }

    private static String newString(String s, int length) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(s);
        }

        return sb.toString();
    }
}

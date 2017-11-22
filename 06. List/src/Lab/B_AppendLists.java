package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_AppendLists {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> result = new ArrayList<>();

        String[] tokens = reader.readLine().split("\\|");

        Collections.reverse(Arrays.asList(tokens));

        for (String token : tokens) {
            String[] digits = token.split(" ");

            for (int i = 0; i < digits.length; i++) {
                String digit = digits[i];
                if (!digit.equals("")) {
                    result.add(digit);
                }
            }
        }

        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
    }
}

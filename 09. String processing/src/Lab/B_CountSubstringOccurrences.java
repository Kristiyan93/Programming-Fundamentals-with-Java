package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CountSubstringOccurrences {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine().toLowerCase();
        String pattern = reader.readLine().toLowerCase();

        Integer count = 0;
        Integer index = text.indexOf(pattern);

        while (index != -1) {
            count++;
            index = text.indexOf(pattern, index + 1);
        }

        System.out.println(count);
    }
}

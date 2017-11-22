package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C_ShortWordsSorted {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> words = Arrays
                .stream(reader.readLine().split("[\"\'.,:;()\\[\\]\\\\!/?\\s]"))
                .collect(Collectors.toList());

        System.out.println(words.stream().filter(x -> x.length() < 5 && !x.equals(""))
                .filter(a -> isLower(a))
                .sorted(String::compareTo)
                .distinct()
                .collect(Collectors.joining(", ")));
    }

    private static boolean isLower(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

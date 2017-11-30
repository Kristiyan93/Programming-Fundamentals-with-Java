package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class D_Palindromes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();

        String[] input = reader.readLine().split("[,?!.\\s+]");

        for (String word : input) {
            if (word.equals("")) {
                continue;
            }
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                list.add(word);
            }
        }

        System.out.println(list.stream().sorted().collect(Collectors.joining(", ")));
    }
}

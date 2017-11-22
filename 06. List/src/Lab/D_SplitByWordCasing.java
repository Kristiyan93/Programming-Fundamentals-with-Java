package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D_SplitByWordCasing {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> input = Arrays
                .stream(reader.readLine().split("[\"\',\\\\;/:.!()\\[\\]\\s]"))
                .collect(Collectors.toList());

        List<String> lowerWords = new ArrayList<>();
        List<String> mixedWords = new ArrayList<>();
        List<String> upperWords = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            String word = input.get(i);

            if (word.equals("")) {
                continue;
            }

            boolean isAllLower = true;
            boolean isAllUpper = true;

            for (int j = 0; j < word.length(); j++) {
                if (Character.isLowerCase(word.charAt(j))) {
                    isAllUpper = false;
                    continue;
                }
                if (Character.isUpperCase(word.charAt(j))) {
                    isAllLower = false;
                    continue;
                } else {
                    isAllLower = false;
                    isAllUpper = false;
                }
            }

            if (isAllLower) {
                lowerWords.add(word);
                continue;
            }
            if (isAllUpper) {
                upperWords.add(word);
                continue;
            } else {
                mixedWords.add(word);
            }
        }

        System.out.println("Lower-case: " + lowerWords.toString().replaceAll("[\\[\\]]", ""));
        System.out.println("Mixed-case: " + mixedWords.toString().replaceAll("[\\[\\]]", ""));
        System.out.println("Upper-case: " + upperWords.toString().replaceAll("[\\[\\]]", ""));
    }
}

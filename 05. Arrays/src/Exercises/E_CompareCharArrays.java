package Exercises;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class E_CompareCharArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] arr1 = reader.readLine().split(" ");
        String[] arr2 = reader.readLine().split(" ");

        List<String> words = new ArrayList<>();
        String sb = "";

        for (int i = 0; i < arr2.length; i++) {
            String c = arr2[i];
            sb += c;
        }

        words.add(sb);
        sb = "";

        for (int i = 0; i < arr1.length; i++) {
            String s = arr1[i];
            sb += s;
        }

        words.add(sb);

        words.sort((a, b) -> a.compareTo(b));

        for (String word : words) {
            System.out.println(word);
        }
    }
}

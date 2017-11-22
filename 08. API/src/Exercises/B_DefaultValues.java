package Exercises;

import com.sun.javafx.collections.MappingChange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class B_DefaultValues {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        String input = reader.readLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" -> ");
            String key = tokens[0];
            String value = tokens[1];

            map.put(key, value);

            input = reader.readLine();
        }

        String replaceValue = reader.readLine();

        map.entrySet()
                .stream()
                .filter(a -> !a.getValue().equals("null"))
                .sorted((a, b) -> Integer.compare(b.getValue().length(), a.getValue().length()))
                .forEach(kvp -> {
                    System.out.println(kvp.getKey() + " <-> " + kvp.getValue());
                });

        map.entrySet()
                .stream()
                .filter(a -> a.getValue().equals("null"))
                .forEach(kvp -> {
                    System.out.println(kvp.getKey() + " <-> " + replaceValue);
                });
    }
}

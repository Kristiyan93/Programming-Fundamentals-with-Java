package Exercises;

import com.sun.javafx.collections.MappingChange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class A_Wardrobe {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        LinkedHashMap<String, LinkedHashMap<String, Integer>> map =
                new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split(" -> ");
            String color = tokens[0];
            String[] items = tokens[1].split(",");

            for (String item : items) {
                if (!map.containsKey(color)) {
                    map.putIfAbsent(color, new LinkedHashMap<>());
                    if (!map.get(color).containsKey(item)) {
                        map.get(color).putIfAbsent(item, 0);
                    }
                    map.get(color).put(item, map.get(color).get(item) + 1);
                } else {
                    if (!map.get(color).containsKey(item)) {
                        map.get(color).putIfAbsent(item, 0);
                    }
                    map.get(color).put(item, map.get(color).get(item) + 1);
                }
            }
        }

        String[] search = reader.readLine().split("\\s");
        String searchColor = search[0];
        String searchItem = search[1];

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : map.entrySet()) {
            String color = entry.getKey();
            LinkedHashMap<String, Integer> items = entry.getValue();

            System.out.printf("%s clothes:%n", color);

            for (Map.Entry<String, Integer> integerEntry : items.entrySet()) {
                String cloth = integerEntry.getKey();
                Integer counter = integerEntry.getValue();

                System.out.printf("* %s - %d", cloth, counter);

                if (cloth.equals(searchItem) && color.equals(searchColor)) {
                    System.out.println(" (found!)");
                } else {
                    System.out.println();
                }
            }
        }
    }
}

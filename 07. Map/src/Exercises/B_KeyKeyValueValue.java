package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class B_KeyKeyValueValue {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String key = reader.readLine();
        String value = reader.readLine();
        Integer n = Integer.parseInt(reader.readLine());

        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split(" => ");
            String currentKey = tokens[0];
            String[] values = tokens[1].split(";");

            for (String s : values) {
                if (currentKey.contains(key)) {
                    if (s.contains(value)) {
                        map.putIfAbsent(currentKey, new ArrayList<>());
                        map.get(currentKey).add(s);
                    }
                }
            }
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.printf("%s:%n", entry.getKey());

            for (String s : entry.getValue()) {
                System.out.printf("-%s%n", s);
            }
        }
    }
}

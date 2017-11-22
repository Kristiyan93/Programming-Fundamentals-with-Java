package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E_DictRefAdvanced {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, List<Integer>> map = new LinkedHashMap<>();

        String input = reader.readLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" -> ");
            String name = tokens[0];
            String[] values = tokens[1].split(",\\s");

            for (String value : values) {
                getMapValues(map, name, value);
            }

            input = reader.readLine();
        }

        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            System.out.printf("%s === ", entry.getKey());
            System.out.println(entry.getValue().toString().replaceAll("[\\[\\]]", ""));
        }
    }

    private static void getMapValues(LinkedHashMap<String, List<Integer>> map, String name, String value) {
        try {
            Integer digit = Integer.parseInt(value);
            map.putIfAbsent(name, new ArrayList<>());
            map.get(name).add(digit);
        } catch (Exception e) {
            if (map.containsKey(value)) {
                map.put(name, map.get(value));
            }
        }
    }
}

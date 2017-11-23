package MoreExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class C_Camping {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, LinkedHashMap<String, Integer>> map = new HashMap<>();

        String input = reader.readLine();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s");
            String name = tokens[0];
            String camper = tokens[1];
            Integer night = Integer.valueOf(tokens[2]);

            map.putIfAbsent(name, new LinkedHashMap<>());
            map.get(name).put(camper, night);

            input = reader.readLine();
        }

        map.entrySet()
                .stream()
                .sorted((a, b) -> {
            int index = 0;
            index = Integer.compare(b.getValue().size(), a.getValue().size());
            if (index == 0) {
                index = Integer.compare(a.getKey().length(), b.getKey().length());
            }

            return index;
                }).forEach(a -> {
            System.out.printf("%s: %d%n", a.getKey(), a.getValue().size());
            a.getValue().entrySet()
                    .stream()
                    .forEach(s -> System.out.printf("***%s%n", s.getKey()));
            int night = a.getValue().values().stream().mapToInt(Integer::valueOf).sum();
            System.out.printf("Total stay: %d nights%n", night);
        });
    }
}

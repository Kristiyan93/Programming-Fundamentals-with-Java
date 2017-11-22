package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class E_FlattenDictionary {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, LinkedHashMap<String, String>> map = new LinkedHashMap<>();

        String input = reader.readLine();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s");

            if (tokens[0].equals("flatten")) {
                String key = tokens[1];

                if (map.containsKey(key)) {
                    LinkedHashMap<String, String> tempDict = new LinkedHashMap<>();
                    for (HashMap.Entry<String, String> e  : map.get(key).entrySet()) {
                        String innerKey = e.getKey();
                        String innerValue = e.getValue();
                        tempDict.put(innerKey + innerValue, "flattened");
                    }

                    map.put(key, tempDict);
                }

            } else {
                String key = tokens[0];
                String innerKey = tokens[1];
                String value = tokens[2];

                map.putIfAbsent(key, new LinkedHashMap<>());
                map.get(key).put(innerKey, value);
            }


        input = reader.readLine();
        }

        int[] count = {0};

        map.entrySet()
                .stream()
                .sorted((a, b) ->
                Integer.compare(a.getValue().size(), b.getValue().size()))
                .forEach(a -> {
                    count[0] = 0;
                    System.out.println(a.getKey());
                    a.getValue().entrySet()
                            .stream()
                            .filter(x -> !x.getValue().equals("flattened"))
                            .sorted(Comparator.comparingInt(q -> q.getKey().length()))
                            .forEach(s ->
                                    System.out.printf("%d. %s - %s%n", ++count[0], s.getKey(), s.getValue()));
                    a.getValue().entrySet()
                            .stream()
                            .filter(x -> x.getValue().equals("flattened"))
                            .forEach(s -> System.out.printf("%d. %s%n", ++count[0], s.getKey()));
                });
    }
}

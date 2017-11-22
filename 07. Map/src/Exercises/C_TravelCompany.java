package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class C_TravelCompany {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, LinkedHashMap<String, Integer>> map =
                new LinkedHashMap<>();

        String input = reader.readLine();

        while (!input.equals("ready")) {
            String[] tokens = input.split(":");
            String city = tokens[0];
            String[] travelType = tokens[1].split("[,-]");

            map.putIfAbsent(city, new LinkedHashMap<>());
            for (int i = 0; i < travelType.length; i += 2) {
                String travel = travelType[i];
                Integer count = Integer.parseInt(travelType[i + 1]);

                map.get(city).putIfAbsent(travel, count);
                map.get(city).put(travel, count);
            }

            input = reader.readLine();
        }

        String secondInput = reader.readLine();

        while (!secondInput.equals("travel time!")) {
            String[] tokens = secondInput.split(" ");
            String city = tokens[0];
            Integer count = Integer.parseInt(tokens[1]);

            for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : map.entrySet()) {
                String cityEntry = entry.getKey();
                LinkedHashMap<String, Integer> countEntry = entry.getValue();

                if (city.equals(entry.getKey())) {
                    Integer sum = 0;

                    for (Map.Entry<String, Integer> integerEntry : countEntry.entrySet()) {
                        sum += integerEntry.getValue();
                    }

                    if (sum >= count) {
                        System.out.printf("%s -> all %d accommodated%n", city, count);
                        break;
                    } else {
                        System.out.printf("%s -> all except %d accommodated%n", city, count - sum);
                    }
                }
            }

            secondInput = reader.readLine();
        }
    }
}

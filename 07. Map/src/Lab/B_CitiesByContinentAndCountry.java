package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class B_CitiesByContinentAndCountry {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        LinkedHashMap<String, LinkedHashMap<String, List<String>>> continents =
                new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split("\\s");
            String cotinent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            if (!continents.containsKey(cotinent)) {
                continents.put(cotinent, new LinkedHashMap<>());
                if (!continents.get(cotinent).containsKey(country)) {
                    continents.get(cotinent).putIfAbsent(country, new ArrayList<>());
                    continents.get(cotinent).get(country).add(city);
                }
            } else {
                if (!continents.get(cotinent).containsKey(country)) {
                    continents.get(cotinent).putIfAbsent(country, new ArrayList<>());
                    continents.get(cotinent).get(country).add(city);
                } else {
                    continents.get(cotinent).get(country).add(city);
                }
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, List<String>>> mapEntry : continents.entrySet()) {
            String continet = mapEntry.getKey();
            LinkedHashMap<String, List<String>> countries = mapEntry.getValue();

            System.out.printf("%s:%n", continet);

            for (Map.Entry<String, List<String>> entry : countries.entrySet()) {
                String country = entry.getKey();
                List<String> cities = entry.getValue();

                System.out.printf(" %s -> ", country);
                System.out.println(cities.toString().replaceAll("[\\[\\]]", ""));
            }
        }
    }
}

package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class D_GroupContinentsCountriesAndCities {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        TreeMap<String, TreeMap<String, TreeSet<String>>> continents =
                new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split("\\s");
            String cotinent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            if (!continents.containsKey(cotinent)) {
                continents.put(cotinent, new TreeMap<>());
                if (!continents.get(cotinent).containsKey(country)) {
                    continents.get(cotinent).putIfAbsent(country, new TreeSet<>());
                    continents.get(cotinent).get(country).add(city);
                }
            } else {
                if (!continents.get(cotinent).containsKey(country)) {
                    continents.get(cotinent).putIfAbsent(country, new TreeSet<>());
                    continents.get(cotinent).get(country).add(city);
                } else {
                    continents.get(cotinent).get(country).add(city);
                }
            }
        }

        for (Map.Entry<String, TreeMap<String, TreeSet<String>>> mapEntry : continents.entrySet()) {
            String continet = mapEntry.getKey();
            TreeMap<String, TreeSet<String>> countries = mapEntry.getValue();

            System.out.printf("%s:%n", continet);

            for (Map.Entry<String, TreeSet<String>> entry : countries.entrySet()) {
                String country = entry.getKey();
                TreeSet<String> cities = entry.getValue();

                System.out.printf(" %s -> ", country);
                System.out.println(cities.toString().replaceAll("[\\[\\]]", ""));
            }
        }
    }
}

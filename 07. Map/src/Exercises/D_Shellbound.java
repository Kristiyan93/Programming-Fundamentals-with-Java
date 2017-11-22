package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class D_Shellbound {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        LinkedHashMap<String, Set<Integer>> map = new LinkedHashMap<>();

        while (!input.equals("Aggregate")) {
            String[] tokens = input.split("\\s");
            String city = tokens[0];
            Integer shell = Integer.parseInt(tokens[1]);

            map.putIfAbsent(city, new LinkedHashSet<>());
            map.get(city).add(shell);

            input = reader.readLine();
        }

        for (Map.Entry<String, Set<Integer>> entry : map.entrySet()) {
            String city = entry.getKey();
            Set<Integer> shells = entry.getValue();

            int sum = 0;

            for (Integer shell : shells) {
                sum += shell;
            }

            System.out.printf("%s -> ", city);
            System.out.print(shells.toString().replaceAll("[\\[\\]]", ""));

            System.out.println(" (" + (sum - (sum / shells.size()))  + ")");
        }
    }
}

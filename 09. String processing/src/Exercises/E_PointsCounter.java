package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class E_PointsCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, HashMap<String, Integer>> map = new HashMap<>();

        String input = reader.readLine();

        while (!input.equals("Result")) {
            String[] tokens = input.split("\\|");
            String token1 = tokens[0].replaceAll("[@%$*]", "");
            String token2 = tokens[1].replaceAll("[@%$*]", "");
            Integer point = Integer.parseInt(tokens[2]);

            Boolean isTeam = true;

            for (int i = 0; i < token1.length(); i++) {
                Character letter = token1.charAt(i);
                if (Character.isLowerCase(letter)) {
                    isTeam = false;
                    break;
                }
            }

            if (isTeam) {
                map.putIfAbsent(token1, new HashMap<>());
                map.get(token1).putIfAbsent(token2, 0);
                map.get(token1).put(token2, map.get(token1).get(token2) + point);
            } else {
                map.putIfAbsent(token2, new HashMap<>());
                map.get(token2).putIfAbsent(token1, 0);
                map.get(token2).put(token1, map.get(token2).get(token1) + point);
            }

            input = reader.readLine();
        }

        map.entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(
                        b.getValue().values().stream().mapToInt(Integer::valueOf).sum(),
                        a.getValue().values().stream().mapToInt(Integer::valueOf).sum()))
                .forEach(s -> {
                    System.out.printf("%s => %d%n", s.getKey(), s.getValue().values().stream().mapToInt(Integer::valueOf).sum());
                    s.getValue().entrySet().stream().sorted((a, b) ->
                    Integer.compare(b.getValue(), a.getValue()))
                            .limit(1)
                            .forEach(x -> System.out.printf("Most points scored by %s%n", x.getKey()));
                });
    }
}


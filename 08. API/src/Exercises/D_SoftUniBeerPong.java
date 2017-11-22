package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class D_SoftUniBeerPong {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, LinkedHashMap<String, Integer>> map = new HashMap<>();

        String input = reader.readLine();

        while (!input.equals("stop the game")) {
            String[] tokens = input.split("\\|");
            String name = tokens[0];
            String team = tokens[1];
            Integer point = Integer.parseInt(tokens[2]);

            map.putIfAbsent(team, new LinkedHashMap<>());
            map.get(team).put(name, point);

            input = reader.readLine();
        }

        int[] position = {1};

        map.entrySet()
                .stream()
                .filter(x -> x.getValue().size() > 2)
                .sorted((a, b) -> Integer.compare(
                    b.getValue().values().stream().mapToInt(Integer::valueOf).sum(),
                    a.getValue().values().stream().mapToInt(Integer::valueOf).sum()))
                .forEach(s -> {
                    System.out.printf("%d. %s; Players:%n", position[0], s.getKey());
                    position[0]++;
                    s.getValue().entrySet()
                            .stream()
                            .limit(3)
                            .sorted((a, b) -> {
                        Integer index = b.getValue().compareTo(a.getValue());
                        if (index == 0) {
                            index = Integer.compare(a.getKey().length(), (b.getKey().length()));
                        }

                        return index;
                    })
                            .forEach(a -> System.out.printf("###%s: %d%n", a.getKey(), a.getValue()));
                });
    }
}

package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class F_CottageScraper {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, List<Long>> map = new LinkedHashMap<>();

        String input = reader.readLine();

        while (!input.equals("")) {
            String[] tokens = input.split(" -> ");
            String type = tokens[0];
            Long height = Long.parseLong(tokens[1]);

            map.putIfAbsent(type, new ArrayList<>());
            map.get(type).add(height);

            input = reader.readLine();
        }

        String type = reader.readLine();
        Long length = Long.parseLong(reader.readLine());


    }
}

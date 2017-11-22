package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class C_ShoppingSpree {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Double> map = new HashMap<>();

        Double budget = Double.parseDouble(reader.readLine());
        String input = reader.readLine();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s");
            String product = tokens[0];
            Double price = Double.parseDouble(tokens[1]);

            if (map.containsKey(product) && map.get(product) > price) {
                map.put(product, price);
            }

            map.putIfAbsent(product, price);
            budget -= price;

            input = reader.readLine();
        }

        if (budget < 0) {
            System.out.println("Need more money… Just buy banichka");
        } else {
            map.entrySet()
                    .stream()
                    .sorted((a, b) -> {
                Integer index = b.getValue().compareTo(a.getValue());
                if (index == 0) {
                    index = Integer.compare(a.getKey().length(), b.getKey().length());
                }
                return index;
            }).forEach(x ->
                    System.out.println(x.getKey() + " costs " + String.format("%.2f", x.getValue())));
        }
    }
}

package MoreExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class D_MostValuedCustomer {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, Double> productPrices = new LinkedHashMap<>();
        LinkedHashMap<String, ArrayList<String>> peopleProducts = new LinkedHashMap<>();
        LinkedHashMap<String, Double> peopleTotalSpendings = new LinkedHashMap<>();

        String productsData = reader.readLine();

        while (!productsData.equals("Shop is open")) {
            String[] tokens = productsData.split(" ");

            productPrices.put(tokens[0], Double.parseDouble(tokens[1]));
            productsData = reader.readLine();
        }

        String peopleData = reader.readLine();
        while (!peopleData.equals("Print")) {
            String[] tokens = peopleData.trim().split(":");

            if (tokens[0].equals("Discount")) {

                productPrices.keySet().stream()
                        .sorted((a,b) -> Double.compare(productPrices.get(b), productPrices.get(a)))
                        .limit(3)
                        .forEach(p -> {
                            productPrices.put(p, productPrices.get(p) * 0.9);
                        });


                peopleData = reader.readLine();
                continue;
            }

            if (!peopleProducts.containsKey(tokens[0])) {
                peopleProducts.put(tokens[0], new ArrayList<>());
                peopleTotalSpendings.put(tokens[0], 0.0);
            }

            String[] productsArr = tokens[1].trim().split(", ");

            for (int i = 0; i < productsArr.length; i++) {
                if (productPrices.containsKey(productsArr[i]) && productPrices.containsKey(productsArr[i])) {
                    peopleProducts.get(tokens[0]).add(productsArr[i]);
                }
            }

            peopleData = reader.readLine();
        }

        for (HashMap.Entry<String, ArrayList<String>> personProducts : peopleProducts.entrySet()) {
            for (String personProduct : personProducts.getValue()) {
                peopleTotalSpendings.putIfAbsent(personProducts.getKey(), 0.0);
                peopleTotalSpendings.put(personProducts.getKey(), peopleTotalSpendings.get(personProducts.getKey()) + productPrices.get(personProduct));
            }
        }

        peopleTotalSpendings.entrySet()
                .stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .limit(1)
                .forEach(p -> {
                    System.out.println("Biggest spender: " + p.getKey());
                    System.out.println("^Products bought:");
                    productPrices.entrySet().stream()
                            .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                            .filter(pr -> peopleProducts.get(p.getKey()).contains(pr.getKey()))
                            .forEach(pr -> System.out.printf("^^^%s: %.2f%n", pr.getKey(), pr.getValue()));
                    System.out.printf("Total: %.2f%n", peopleTotalSpendings.get(p.getKey()));
                });
    }
}
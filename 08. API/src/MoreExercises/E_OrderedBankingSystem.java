package MoreExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class E_OrderedBankingSystem {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, LinkedHashMap<String, BigDecimal>> accounts = new LinkedHashMap<>();

        String input = reader.readLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" -> ");
            String bank = tokens[0];
            String name = tokens[1];
            BigDecimal balance = new BigDecimal(tokens[2]);

            accounts.putIfAbsent(bank, new LinkedHashMap<>());
            accounts.get(bank).putIfAbsent(name, BigDecimal.ZERO);
            accounts.get(bank).put(name, accounts.get(bank).get(name).add(balance));

            input = reader.readLine();
        }

        accounts.entrySet()
                .stream()
                .sorted((a, b) -> {
            BigDecimal aValue = a.getValue().entrySet()
                    .stream()
                    .map(HashMap.Entry::getValue)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
            BigDecimal bValue = b.getValue().entrySet()
                    .stream()
                    .map(HashMap.Entry::getValue)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);

            int index = bValue.compareTo(aValue);

            if (index == 0) {
                BigDecimal maxAValue = a.getValue().entrySet()
                        .stream()
                        .map(HashMap.Entry::getValue)
                        .max(BigDecimal::compareTo).get();

                BigDecimal maxBValue = b.getValue().entrySet()
                        .stream()
                        .map(HashMap.Entry::getValue)
                        .max(BigDecimal::compareTo).get();

                index = maxBValue.compareTo(maxAValue);
            }

            return index;
        })
                .forEach(b -> {
                    b.getValue().entrySet()
                            .stream()
                            .sorted((a1, a2) -> a2.getValue().compareTo(a1.getValue()))
                            .forEach(a -> {
                                System.out.printf("%s -> %s (%s)%n", a.getKey(), a.getValue(), b.getKey());
                            });
                });
    }
}

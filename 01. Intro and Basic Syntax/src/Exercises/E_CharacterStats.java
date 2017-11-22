package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_CharacterStats {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        Integer currentHealth = Integer.parseInt(reader.readLine());
        Integer maxHealth = Integer.parseInt(reader.readLine());
        Integer currentEnergy = Integer.parseInt(reader.readLine());
        Integer maxEnergy = Integer.parseInt(reader.readLine());

        System.out.println("Name: " + name);
        System.out.println("Health: |" + newString("|", currentHealth)
        + newString(".", maxHealth - currentHealth) + "|");
        System.out.println("Energy: |" + newString("|", currentEnergy)
                + newString(".", maxEnergy - currentEnergy) + "|");

    }
    public static String newString(String str, Integer count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }

        return sb.toString();
    }
}

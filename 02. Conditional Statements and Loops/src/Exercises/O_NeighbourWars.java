package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class O_NeighbourWars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer peshoDamage = Integer.parseInt(reader.readLine());
        Integer goshoDamage = Integer.parseInt(reader.readLine());

        Integer peshoPoints = 100;
        Integer goshoPoints = 100;
        Integer round = 1;

        while (true) {
            if (round % 2 != 0) {
                goshoPoints -= peshoDamage;

                if (goshoPoints <= 0) {
                    System.out.printf("Pesho won in %dth round.%n", round);
                    break;
                } else {
                    System.out.printf("Pesho used Roundhouse kick and reduced Gosho to %d health.%n", goshoPoints);
                }
            }
            else if (round % 2 == 0) {
                peshoPoints -= goshoDamage;

                if (peshoPoints <= 0) {
                    System.out.printf("Gosho won in %dth round.%n", round);
                    break;
                } else {
                    System.out.printf("Gosho used Thunderous fist and reduced Pesho to %d health.%n", peshoPoints);
                }
            }

            if (round % 3 == 0) {
                goshoPoints += 10;
                peshoPoints += 10;
            }

            round++;
        }
    }
}

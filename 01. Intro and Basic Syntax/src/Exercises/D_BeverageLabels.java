package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class D_BeverageLabels {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String product = reader.readLine();
        Integer volume = Integer.parseInt(reader.readLine());
        Integer energy = Integer.parseInt(reader.readLine());
        Integer sugar = Integer.parseInt(reader.readLine());

        Double kcal = volume * energy / 100.0;
        Double g = volume * sugar / 100.0;

        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println(volume + "ml " + product + ":");
        System.out.println(df.format(kcal) + "kcal, " + df.format(g) + "g sugars");
    }
}

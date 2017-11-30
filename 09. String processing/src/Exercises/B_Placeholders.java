package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Placeholders {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        StringBuilder sb = new StringBuilder();

        while (!input.equals("end")) {
            String[] tokens = input.split(" -> ");
            String text = tokens[0];
            String[] elements = tokens[1].split(", ");

            for (int i = 0; i < elements.length; i++) {
                String element = elements[i];

                text = text.replace("{" + i +"}", element);
            }

            sb.append(text + "\n");
            input = reader.readLine();
        }

        System.out.println(sb.toString());
    }
}

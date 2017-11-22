package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_RegisteredUsers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" -> ");
            String name = tokens[0];

            input = reader.readLine();
        }
    }
}

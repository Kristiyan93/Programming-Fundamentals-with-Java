package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_HelloName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputName= reader.readLine();

        printHelloName(inputName);
    }

    private static void printHelloName(String inputName) {
        System.out.printf("Hello, %s!", inputName);
    }
}

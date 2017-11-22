package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_EnglishNameofLastDigit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        getLastDigit(n);
    }
    public static void getLastDigit(Integer num) {
        Integer lastDigit = Math.abs(num % 10);

        String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        System.out.println(digits[lastDigit]);
    }
}

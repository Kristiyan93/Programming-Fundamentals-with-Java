package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_FibonacciNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int sum = 0;
            int firstNum = 0;
            int secondNum = 1;

            for (int i = 0; i < n; i++)
            {
                sum = secondNum + firstNum;
                firstNum = secondNum;
                secondNum = sum;
            }
            return sum;
        }
    }
}

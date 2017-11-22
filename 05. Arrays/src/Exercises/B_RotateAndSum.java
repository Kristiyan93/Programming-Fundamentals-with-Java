package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_RotateAndSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays
                .stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Integer rotateTime = Integer.parseInt(reader.readLine());

        int[] sumArray = new int[arr.length];

        for (int i = 0; i < rotateTime; i++) {
            int lastElement = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = lastElement;

            for (int k = 0; k < arr.length; k++) {
                sumArray[k] += arr[k];
            }
        }

        System.out.println(Arrays.toString(sumArray).replaceAll("[\\[\\],]", ""));
    }
}

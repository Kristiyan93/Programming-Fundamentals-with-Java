package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class D_TripleSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays
                .stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isContains = true;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                Integer sum = arr[i] + arr[j];

                for (int k = 0; k < arr.length; k++) {
                    if (arr[k] == sum) {
                        System.out.printf("%d + %d == %d%n", arr[i], arr[j], sum);
                        isContains = false;
                    }
                }
            }
        }

        if (isContains) {
            System.out.println("No");
        }
    }
}

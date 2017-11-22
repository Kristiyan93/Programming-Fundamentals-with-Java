package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class C_FoldAndSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays
                .stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int k = arr.length / 4;

        int[] leftArr = new int[k];
        int[] middleArr = new int[2 * k];
        int[] rightArr = new int[k];

        int[] resultArray = new int[2 * k];

        for (int i = 0; i < k; i++) {
            leftArr[i] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            rightArr[i] = arr[3 * k + i];
        }

        for (int i = 0; i < 2 * k; i++) {
            middleArr[i] = arr[k + i];
        }

        for (int i = 0; i < leftArr.length; i++) {
            int temp = leftArr[0];
            leftArr[0] = leftArr[leftArr.length - 1 - i];
            leftArr[leftArr.length - 1 - i] = temp;

        }

        for (int i = 0; i < rightArr.length; i++) {
            int temp = rightArr[0];
            rightArr[0] = rightArr[rightArr.length - 1 - i];
            rightArr[rightArr.length - 1 - i] = temp;
        }

        for (int i = 0; i < k; i++) {
            resultArray[i] += leftArr[i] + middleArr[i];
            resultArray[i + k] += middleArr[i + k] + rightArr[i];
        }

        System.out.println(Arrays.toString(resultArray).replaceAll("[\\[\\],]", ""));
    }
}

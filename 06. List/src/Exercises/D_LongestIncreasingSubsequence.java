package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class D_LongestIncreasingSubsequence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] sequence = Arrays
                .stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] longestSeq = findLongestIncreasingSubsequence(sequence);

        System.out.println(Arrays.toString(longestSeq).replaceAll("[\\[\\],]", ""));
    }

    private static int[] findLongestIncreasingSubsequence(int[] sequence) {
        int[] length = new int[sequence.length];
        int[] prev = new int[sequence.length];
        int maxLength = 0;
        int lastIndex = -1;

        for (int i = 0; i < sequence.length; i++) {
            length[i] = 1;
            prev[i] = -1;

            for (int j = 0; j < i; j++) {
                if (sequence[j] < sequence[i] && length[j] >= length[i]) {
                    length[i] = 1 + length[j];
                    prev[i] = j;
                }
            }
            if (length[i] > maxLength) {
                maxLength = length[i];
                lastIndex = i;
            }
        }

        List<Integer> longestSeq = new ArrayList<>();
        for (int i = 0; i < maxLength; i++) {
            longestSeq.add(sequence[lastIndex]);
            lastIndex = prev[lastIndex];
        }

        Collections.reverse(longestSeq);

        int[] longestSequea = longestSeq.stream().mapToInt(i->i).toArray();

        return longestSequea;
    }
}

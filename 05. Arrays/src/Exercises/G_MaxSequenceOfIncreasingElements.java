package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class G_MaxSequenceOfIncreasingElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] elements = Arrays
                .stream(reader.readLine().split(" "))
                .mapToInt(Integer::valueOf)
                .toArray();

        int bestIndex = 0;
        int bestLength = 1;
        int currentIndex = 0;
        int currentLength = 1;
        for (int i = 1; i < elements.length; i++) {
            if (elements[i] > elements[i - 1]) {
                currentLength++;

                if (currentLength > bestLength) {
                    bestLength = currentLength;
                    bestIndex = currentIndex;
                }
            } else {
                currentLength = 1;
                currentIndex = i;
            }
        }

        for (int i = bestIndex; i < bestIndex + bestLength; i++) {
            System.out.printf("%d ", elements[i]);
        }
    }
}

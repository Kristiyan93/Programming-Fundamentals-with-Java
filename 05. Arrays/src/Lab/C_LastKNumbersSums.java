package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class C_LastKNumbersSums {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());
        Integer k = Integer.parseInt(reader.readLine());

        Integer[] seq = new Integer[n];
        seq[0] = 1;

        for (int i = 1; i < seq.length; i++) {
            Integer start = Math.max(0, i-k);
            Integer end = i - 1;
            Integer sum = 0;

            for (int j = start; j <= end; j++) {
                sum += seq[j];
            }

            seq[i] = sum;
        }

        System.out.println(Arrays.toString(seq).replaceAll("[,\\[\\]]", ""));
    }
}

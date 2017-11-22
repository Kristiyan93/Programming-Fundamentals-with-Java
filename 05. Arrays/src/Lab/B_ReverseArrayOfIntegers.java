package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class B_ReverseArrayOfIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        Integer[] numbers = new  Integer[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length -i - 1];
            numbers[numbers.length -i - 1] = temp;
        }

        //List<Integer> list = Arrays.asList(numbers);
        //Collections.reverse(list);

        //System.out.println(list.toString().replaceAll("[,\\[\\]]", ""));
        System.out.println(Arrays.toString(numbers).replaceAll("[,\\[\\]]", ""));
    }
}

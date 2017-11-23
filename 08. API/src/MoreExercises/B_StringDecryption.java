package MoreExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class B_StringDecryption {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] getElements = Arrays
                .stream(reader.readLine().split("\\s"))
                .mapToInt(Integer::valueOf)
                .toArray();
        int[] elements = Arrays
                .stream(reader.readLine().split("\\s"))
                .mapToInt(Integer::valueOf)
                .toArray();

        System.out.println(Arrays.stream(elements)
                .filter(e -> e > 64 && e < 100)
                .mapToObj(e -> (char) e)
                .map(Object::toString)
                .skip(getElements[0])
                .limit(getElements[1])
                .collect(Collectors.joining(" ")));

    }
}

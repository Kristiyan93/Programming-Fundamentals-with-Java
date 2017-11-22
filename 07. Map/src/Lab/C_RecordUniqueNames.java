package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class C_RecordUniqueNames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        Set<String> names = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String name = reader.readLine();

            names.add(name);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}

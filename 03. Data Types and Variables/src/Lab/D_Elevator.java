package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_Elevator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());
        Integer p = Integer.parseInt(reader.readLine());

        Integer course = (int)Math.ceil((double)n / p);

        System.out.println(course);
    }
}

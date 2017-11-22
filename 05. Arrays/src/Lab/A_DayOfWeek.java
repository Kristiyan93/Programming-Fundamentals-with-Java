package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_DayOfWeek {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] days = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday",};

        Integer n = Integer.parseInt(reader.readLine());

        if (n > 7 && n <= 0) {
            System.out.println("Invalid Day!");
            return;
        }

        System.out.println(days[n - 1]);
    }
}

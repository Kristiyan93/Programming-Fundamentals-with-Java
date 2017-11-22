package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_MonthPrinter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] mounths = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        Integer mounth = Integer.parseInt(reader.readLine());

        if (mounth > 0 && mounth < 13) {
            System.out.println(mounths[mounth - 1]);
        } else {
            System.out.println("Error!");
        }
    }
}

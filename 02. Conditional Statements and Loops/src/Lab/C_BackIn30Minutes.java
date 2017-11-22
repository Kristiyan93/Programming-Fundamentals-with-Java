package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_BackIn30Minutes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer hours = Integer.parseInt(reader.readLine());
        Integer minutes = Integer.parseInt(reader.readLine());

        Integer moreMinutes = 30 + minutes;

        if (moreMinutes > 59) {
            moreMinutes -= 60;
            hours++;
        }
        if (hours > 23) {
            hours -= 24;
        }

        System.out.printf("%d:%02d", hours, moreMinutes);
    }
}

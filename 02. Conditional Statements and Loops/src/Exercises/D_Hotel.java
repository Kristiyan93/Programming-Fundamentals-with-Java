package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_Hotel {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String month = reader.readLine();
        Integer nights = Integer.parseInt(reader.readLine());

        double nightStudio = 0d;
        double nightDouble = 0d;
        double nightSuite = 0d;

        switch (month) {
            case "May":
            case "October":
                nightStudio = 50;
                nightDouble = 65;
                nightSuite = 75;
                if (nights > 7) {
                    nightStudio *= 0.95;
                }
                break;
            case "June":
            case "September":
                nightStudio = 60;
                nightDouble = 72;
                nightSuite = 82;
                if (nights > 14) {
                    nightDouble *= 0.90;
                }
                break;
            case "July":
            case "August":
            case "December":
                nightStudio = 68;
                nightDouble = 77;
                nightSuite = 89;
                if (nights > 14) {
                    nightSuite *= 0.85;
                }
                break;
        }

        Double totalStudio = nightStudio * nights;
        Double totalDouble = nightDouble * nights;
        double totalSuite = nightSuite * nights;
        if ((month.equals("September") || month.equals("October")) && nights > 7) {
            totalStudio -= nightStudio;
        }

        System.out.printf("Studio: %.2f lv.%nDouble: %.2f lv.%nSuite: %.2f lv.", totalStudio, totalDouble, totalSuite);
    }
}

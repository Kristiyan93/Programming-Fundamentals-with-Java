package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_DataTypesAndVariables {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer centuries = Integer.parseInt(reader.readLine());

        Integer years = centuries * 100;
        Integer days  = (int)(years * 365.2422);
        Integer hours = days * 24;
        Integer minutes = hours * 60;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes", centuries, years, days, hours, minutes);
    }
}

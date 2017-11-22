package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_PrintingTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= n; i++) {
            System.out.println(printLine(i));
        }
        for (int i = n -1; i >= 1; i--) {
            System.out.println(printLine(i));
        }
    }

    private static String printLine(Integer end) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < end; i++) {
            sb.append(i + 1);
            sb.append(" ");
        }

        return sb.toString();
    }
}

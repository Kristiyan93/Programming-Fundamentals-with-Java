package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_ForeignLanguages {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        if (input.equals("England") || input.equals("USA")) {
            System.out.println("English");
            return;
        }
        if (input.equals("Spain") || input.equals("Argentina") || input.equals("Mexico")) {
            System.out.println("Spanish");
            return;
        } else {
            System.out.println("unknown");
        }
    }
}

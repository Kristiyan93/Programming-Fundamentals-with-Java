package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_JSONParse {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String text = reader.readLine();
        text = text.substring(2, text.length() - 2);

        String[] input = text.split("},\\{");

        for (String token : input) {
            String[] properties = token.split(",");
            //String[] properties = token.split("name:\"", "\",age:", ",grades:");
            String name = properties[0].replace("name:\"", "").replace("\"", "");
            String age = properties[1].replace("age:", "");
            String grades = "";
            for (int i = 2; i < properties.length; i++) {
                grades += properties[i];
            }
            grades = grades.substring(8, grades.length() - 1).replace(" ", ", ");

            if (grades.isEmpty()) {
                grades = "None";
            }
            System.out.printf("%s : %s -> %s%n", name, age, grades);
        }
    }
}

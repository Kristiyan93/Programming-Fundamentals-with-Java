package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_JSONStringify {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String input = reader.readLine();

        sb.append("[");

        while (!input.equals("stringify")) {
            String[] tokens = input.split(" : ");
            String name = tokens[0];
            String[] tokens2 = tokens[1].split(" -> ");
            String age = tokens2[0];

            try {
                sb.append("{name:\"" + name + "\",age:" + age + ",grades:[" + tokens2[1] + "]},");
            } catch (Exception e) {
                sb.append("{name:\"" + name + "\",age:" + age.replace(" ->", "") +",grades:[" + "" + "]},");
            }

            input = reader.readLine();
        }

        Integer lastIndex = sb.lastIndexOf(",");
        sb = sb.replace(lastIndex,lastIndex + 1, "");

        sb.append("]");

        System.out.println(sb.toString());
    }
}

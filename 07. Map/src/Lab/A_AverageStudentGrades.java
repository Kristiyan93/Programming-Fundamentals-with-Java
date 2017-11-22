package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A_AverageStudentGrades {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        LinkedHashMap<String, List<Double>> students = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split("\\s");
            String name = tokens[0];
            Double grade = Double.parseDouble(tokens[1]);

            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            String name = entry.getKey();
            List<Double> grades = entry.getValue();

            System.out.printf("%s -> ", name);

            for (Double grade : grades) {
                System.out.printf("%.2f ", grade);
            }

            Double avg = grades.stream().mapToDouble(Double::valueOf).average().getAsDouble();

            System.out.printf("(avg: %.2f)%n", avg);
        }
    }
}

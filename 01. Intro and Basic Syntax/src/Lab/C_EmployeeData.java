package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_EmployeeData {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name= reader.readLine();
        Integer age = Integer.parseInt(reader.readLine());
        Integer id = Integer.parseInt(reader.readLine());
        Double salary = Double.parseDouble(reader.readLine());

        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Employee ID: %08d%n", id);
        System.out.printf("Salary: %.2f%n", salary);
    }
}

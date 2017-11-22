package Lab;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A_BlankReceipt {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        printReciptHeader();
        printReciptBody();
        printReciptFooter();
    }
    public static void printReciptHeader() {
        System.out.println("CASH RECEIPT");
        System.out.println("------------------------------");
    }
    public static void printReciptBody() {
        System.out.println("Charged to____________________");
        System.out.println("Received by___________________");
    }
    public static void printReciptFooter() {
        System.out.println("------------------------------");
        System.out.println("\u00A9" + " SoftUni");
    }
}

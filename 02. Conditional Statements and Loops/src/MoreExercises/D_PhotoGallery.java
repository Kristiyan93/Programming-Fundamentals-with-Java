package MoreExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_PhotoGallery {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer number = Integer.parseInt(reader.readLine());
        Integer day = Integer.parseInt(reader.readLine());
        Integer month = Integer.parseInt(reader.readLine());
        Integer year = Integer.parseInt(reader.readLine());
        Integer hours = Integer.parseInt(reader.readLine());
        Integer minutes = Integer.parseInt(reader.readLine());
        Double size = Double.parseDouble(reader.readLine());
        Integer width = Integer.parseInt(reader.readLine());
        Integer height = Integer.parseInt(reader.readLine());

        if (minutes > 59) {
            hours++;
            minutes -= 60;
        }
        if (hours > 23) {
            hours = 0;
        }

        System.out.printf("Name: DSC_%04d.jpg%n", number);
        System.out.printf("Date Taken: %02d/%02d/%d %d:%02d%n", day, month, year, hours, minutes);
        if (size < 1000) {
            System.out.printf("Size: %.1fB", size);
        }
        else if (size < 1000000) {
            size /= 1000.0;
            System.out.printf("Size: %.1fKB", size);
        } else {
            size /= 1000000.0;
            System.out.printf("Size: %.1fMB", size);
        }

        System.out.println();

        if (width > height) {
            System.out.printf("Resolution: %dx%d (landscape)", width, height);
        }
        else if (height > width) {
            System.out.printf("Resolution: %dx%d (portrait)", width, height);
        }
        else if (height == width) {
            System.out.printf("Resolution: %dx%d (square)", width, height);
        }
    }
}

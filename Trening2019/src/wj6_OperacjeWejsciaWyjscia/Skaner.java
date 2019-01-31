package wj6_OperacjeWejsciaWyjscia;

import java.util.Scanner;

public class Skaner {
    public static void main(String[] args) {
        System.out.println("Witaj świecie!");

        Scanner scanner = new Scanner(System.in); // przekazujemy standardowe wejscie (System.in)
        String userString = scanner.nextLine();
        scanner.close();

        System.out.println("Twoj napis to: " + userString);

    }
}

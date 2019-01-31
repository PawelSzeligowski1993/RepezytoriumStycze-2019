package wj4_AlgorytmyiStrukturyDanych.wj41_ArrayListPrzyklad;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class TotekTest {
    public static void main(String[] args) {
        int[] wyniki;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj k");
        int k = scanner.nextInt();
        System.out.println("Podaj n");
        int n = scanner.nextInt();
        if(k<n && n<=50) {
            wyniki = Totek.losuj(k, n);
            System.out.println(Arrays.toString(wyniki));
        }else System.out.println("O kurwa!!!");
    }
}

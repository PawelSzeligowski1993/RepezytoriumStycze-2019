package aPomoce.start;

import java.util.Scanner;

public class Pętle2 {
    public static void main(String[] args) {
/*
12. * Przy użyciu pętli (>1) narysuj poniższy trójkąt na ekranie :
        @
        @@
        @@@
        @@@@
        @@@@@
13. * Zmodyfikuj zadanie 12, aby pobierać od użytkownika liczbę, która określi wielkość trójkąta (nie więcej niż 20)
 */
        Scanner skaner = new Scanner(System.in);

        int index;
        char znak = '@';

        System.out.println("Podaj wielkość piramidy");
        int lenght = skaner.nextInt();
        char tab[] = new char[lenght];

        for (int i =0;i<tab.length;i++){

            tab[i] = znak;
            System.out.println(tab);
        }
    }
}

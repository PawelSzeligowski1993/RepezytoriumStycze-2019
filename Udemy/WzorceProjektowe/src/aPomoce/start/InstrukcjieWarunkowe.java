package aPomoce.start;

import java.util.Scanner;

public class InstrukcjieWarunkowe {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        int liczba1;
        int liczba2;
        System.out.println("Podaj wartość liczby1");
        liczba1=skaner.nextInt();
        System.out.println("Podaj wartość liczby2");
        liczba2=skaner.nextInt();

        if(liczba1%liczba2 == 0){
            System.out.println("☺");
        }else {
            System.out.println("☹");
        }
    }
}

package aPomoce.start;

import java.util.Scanner;

public class Petle {
    public static void main(String[] args) {

       /*
       W zadaniu przyjęto że kapitalizacja nastepuje co 1 miesiąc
        */

        Scanner skaner = new Scanner(System.in);

        int kwota;
        int roczneOprLo;
        int miesiac;

        System.out.println("Podaj kwotę");
        kwota = skaner.nextInt();
        System.out.println("Podaj roczne oprocętowanie lokaty");
        roczneOprLo = skaner.nextInt();
        System.out.println("Podaj miesiac");
        miesiac = skaner.nextInt();




        float wynik;
        wynik=kwota;
        for (int i = 1; i<49;i++){
             wynik = wynik+((roczneOprLo*wynik)/100);
            System.out.println("Miesiac "+i+" : "+wynik);
        if(i  ==48){
            System.out.println("Koncowy wynik = "+wynik);
            }
        }

    }
}

package aPomoce.klasaRandom;

import java.util.LinkedList;
import java.util.Random;

public class KlasaRandom {
    public static void main(String[] args) {
        LinkedList d = new LinkedList();
        Random generator = new Random();

        //Losowanie dowolnych  Double z przedzialo 0-1 , trzeba przemnożyc
        for (int i = 0; i < 36; i++) {
            d.add(generator.nextDouble() * 10);

            if (i == 35) {
                System.out.println("\nmetoda nextDouble() " +d);
            }
        }

        //zmiennoprzecinkowe pojedyncze
        LinkedList f = new LinkedList();

        for (int i = 0; i < 36; i++) {
            f.add(generator.nextFloat());

            if (i == 35) {
                System.out.println( "\nmetoda nextFloat() " +f);
            }
        }

        //metoda losuje Intiger ujemne i dodatnie
        LinkedList in = new LinkedList();

        for (int j = 0; j < 36; j++) {
            in.add(generator.nextInt());

            if (j == 35) {
                System.out.println("\nmetoda nextInt() " +in);
            }
        }

        // metoda generuje liczby z zakresu od zera do parametru n
        // int nextInt(int n)

        LinkedList intn = new LinkedList();
        for (int j = 0; j <36 ; j++) {
            intn.add(generator.nextInt(5));

            if (j == 35){
                System.out.println("\nmetoda nextInt(n) "+intn);
            }
        }
    }
}

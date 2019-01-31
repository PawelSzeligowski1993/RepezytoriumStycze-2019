package wj4_AlgorytmyiStrukturyDanych.wj41_ArrayListPrzyklad;

import java.util.ArrayList;
import java.util.Random;

public class Totek {
    public static int[] losuj(int k, int n){
        Random crazy = new Random();
        ArrayList<Integer> pula = new ArrayList<>(n);
        int[] wylosowane = new int[k];

        for (int i=1; i <= n;i++){
            pula.add(i);
        }
        int counter = n;

        for (int j=1; j<k; j++){
            int index = crazy.nextInt(counter);
            wylosowane[j] = pula.get(index);
            pula.remove(index);
            counter --;
        }
        return wylosowane;

    }
}

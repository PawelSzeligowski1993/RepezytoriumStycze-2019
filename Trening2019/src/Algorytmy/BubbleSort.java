package Algorytmy;

public class BubbleSort {
    public static void sort(int[] arrayToSort) {
        int n = arrayToSort.length; // ilosc elementow
        int it = 0; // licznik iteracji petli
        boolean swaped = true;

        // flaga swaped ma zapobiec wykonywania operacji na juz posortowanej tablicy
        while (it < n - 1&&swaped)// wykonywane tak dlugo az liczba iteracji zrowna sie z iloscia elementow
        {
            swaped = false;
            for (int j = 0; j < n - 1- it; j++)  // odejmuje it a po co to nie wiem
            {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    swap(arrayToSort, j, j + 1);
                    swaped = true;
                }
            }
            it++; // inkrementacja licznika o 1
        }
    }


        // swap jest funkcja zamiany
    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1]; // lokalne przechowanie pierwszego indeksu
        arr[index1] = arr[index2];// przypisanie indeksu pierwszego jako indeksu 2
        arr[index2] =temp;        // przypisanie indeksu 2 jako indeksu pierwszego
    }
}

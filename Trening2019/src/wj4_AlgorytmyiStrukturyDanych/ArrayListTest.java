package wj4_AlgorytmyiStrukturyDanych;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //Array list rózni sie tym od tablicy że ma zmienna dlugość

        ArrayList<Integer> liczby = new ArrayList<>();
        liczby.add(1);
        liczby.add(2);
        liczby.add(3);
        liczby.add(4);
        System.out.println(liczby);

        ArrayList<String> wyrazy = new ArrayList<String>();

        // Instrukcja add - dodawanie
        wyrazy.add("TO");
        wyrazy.add("jest");
        wyrazy.add("nasza");
        wyrazy.add("wspaniala");
        wyrazy.add("lista");
        wyrazy.add("lista");
        wyrazy.add("lista");
        System.out.println(wyrazy);

        for (String s:wyrazy){
            System.out.println(s+ " ");
        }

        wyrazy.add(1,"nie");
        for (String s:wyrazy){
            System.out.println(s+ " ");
        }
    // remove - usuwanie
        wyrazy.remove("nasza");
        wyrazy.remove(2);
        for (String s:wyrazy){
            System.out.println(s+ " ");
        }
    //  contains - wyszukiwanie zwraca true lub false
        System.out.println(wyrazy.contains("TO"));

    //  indexOf - pozycja na której jest element
        System.out.println(wyrazy.indexOf("lista"));
        // jak czegos nie ma to wpisze -1
        System.out.println(wyrazy.indexOf("a"));

    //  lastIndexOf - ostatnie wystapienie
        System.out.println(wyrazy.lastIndexOf("lista"));

    // wyswietlanie lelemntów - get
        System.out.println(wyrazy.get(2));

    //  ustawianie elementow - set
        System.out.println(wyrazy);
        wyrazy.set(4, "pomidor");
        System.out.println(wyrazy);

    // size  = rozmiar

        System.out.println(wyrazy.size());

    //  clear
        wyrazy.clear();
        System.out.println(wyrazy);

    }
}

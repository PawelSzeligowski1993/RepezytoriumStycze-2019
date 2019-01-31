package aPomoce.kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        System.out.println(lista.size());
        lista.add("Tomek");
        lista.add("Kasia");
        lista.add("Michał");

        System.out.println(lista.isEmpty());
        System.out.println(lista);
        System.out.println(lista.size());

        System.out.println(lista.get(1));
        System.out.println(lista.contains("Marek"));
        System.out.println(lista.contains("Tomek"));

        lista.clear();
        System.out.println(lista);

        // sety - pewna kolekcja reprezentuje kolekcje unikalnych elementów
        //HashSet - jest to rodzaj setu do którego można dodawac unikalne dane
//        Set<Integer> set = new HashSet<>();
//
//        set.add(5);
//        set.add(6);
//        set.add(5);

//        System.out.println(set);
    }
}

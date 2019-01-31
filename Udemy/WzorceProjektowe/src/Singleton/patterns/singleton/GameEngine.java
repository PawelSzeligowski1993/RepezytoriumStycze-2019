// Singleton zapobiega przed tworzeniem nowej instancji klasy w projekcie
/**
 * Singleton posiada 4 rozne punkty zapalne:
 * - wielowatkowosc - dwa watki wywolaja sie w tym samym czasie, a powinny po kolei, zdarzenie to moze powstac
 * przed inicjalizacja nowego biektu : instance = new GameEngine(); mozemy zrobic metode synchroniczną  - synchronized, ale wtedy inne
 * wątki będą musiały czekać , mozna zrobic blok synchroniczny dla momentu  inicjalizacji
 * => public static GameEngine getInstance(){
 *     if(instance==null){
 *         instance = new GameEngine();
 *     }
 *     return instance;
 * }
 * singleton zapewnia nam unikalnosc tylko na poziomie 1 klaslodera
 * - serializacje
 *
 * - refleksje
 * jak ktos zrobi nasz konstruktor publiczny, ale mozemy sie oprzed tym zabezpieczyć implementujac singleton jako enum
 * - klaslodery
 *
 * zaletą emumów jest to ze powinny byc zabezpieczone przed serializacja, refleksja , dla kazdego enuma powinna byc tylko 1 instancja
 * i to musi za nas robic wirtualna maszyna
 */


package Singleton.patterns.singleton;

import java.io.Serializable;

public class GameEngine implements Serializable {

    // ktos moze nam serializowac sibgletona i zamiast 1 singletona robi sie dowolna ilość
    private static final long serialVersionUID = 232323232;

    private int hp = 100;
    private String characterName = "";

    //Ten static wykona sie w momencie gdy klasa zostanie zaladowana do klaslodera
    private static GameEngine instance = new GameEngine();

    private GameEngine(){

    }


    public void run(){
        while(true){
            //czekamy na input gracza
            //zmieniamy stan gry
            //refenderujemy grafike
        }
    }

    public static GameEngine getInstance(){
//   Blok synchroniczny
//        if(instance==null) {
//
//            synchronized (GameEngine.class) {
//             if (instance==null) {
//                 instance = new GameEngine();
//                }
//            }
//        }
        return instance;
    }


    // to sie wywola zawsze gdy object bedzie serializowany i wtedy zwroci nam to samo co metoda
    // getInstance i jestesmy zabezpieczeni przed serializacja
    protected Object readResolve(){
        return getInstance();
    }
}

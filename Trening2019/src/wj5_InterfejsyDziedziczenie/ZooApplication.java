package wj5_InterfejsyDziedziczenie;

import java.util.ArrayList;
import java.util.List;

public class ZooApplication {
    public static void main(String[] args) {
        Elephant elephant1 = new Elephant();
        elephant1.name = "Hadoop";
        elephant1.age = "11";
        elephant1.weight = "7000";

        Elephant elephant2 = new Elephant();
        elephant2.name = "Dumboo";
        elephant2.age = "77";
        elephant2.weight = "6000";

        Lion lion1 = new Lion();
        lion1.name ="Simba";
        lion1.age ="24";
        lion1.weight ="100";

        List<Elephant> elephants = new ArrayList<>();
        elephants.add(elephant1);
        elephants.add(elephant2);
        //elephants.add(Lion); - tak nie można zrobić, Lew nie jest Słoniem

        List<Animal> animals = new ArrayList<>();
        animals.add(elephant1);
        animals.add(elephant2);
        animals.add(lion1);   // Tak już można zrobić, lew jest zwierzeciem

        System.out.println("Liczba słoni: " + elephants.size());
        System.out.println("Liczba zwierząt: " + animals.size());




        System.out.println();


    }
}

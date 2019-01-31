package wj5_InterfejsyDziedziczenie;

import java.util.ArrayList;
import java.util.List;

public class ZooApplication2 {
    public static void main(String[] args) {
        Elephant elephant1 = new Elephant();
        elephant1.setName("Hadoop");
        elephant1.eat(7000);
        elephant1.growOld(11);

        Elephant elephant2 = new Elephant();
        elephant2.setName("Dumboo");
        elephant2.eat(6000);
        elephant2.growOld(77);

        Lion lion1 = new Lion();
        lion1.setName("Simba");
        lion1.eat(100);
        lion1.growOld(24);

        Parrot parrot1 = new Parrot();
        parrot1.setName("Ara");
        parrot1.eatPlant(1);
        parrot1.growOld(5);

        List<Elephant> elephants = new ArrayList<>();
        elephants.add(elephant1);
        elephants.add(elephant2);
        System.out.println("Liczba Słoni wynosi: " + elephants.size());

        List<Herbivore> herbivores = new ArrayList<>();
        herbivores.add(elephant1);
        herbivores.add(elephant2);
        herbivores.add(parrot1);
        System.out.println("Liczba roślinożerców wynosi: " + herbivores.size());

        List<Animal> animals = new ArrayList<>();
        animals.add(elephant1);
        animals.add(elephant2);
        animals.add(lion1);
        System.out.println("Liczba Zwierząt wynosi: " + animals.size());



    }
}

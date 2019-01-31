package wj5_InterfejsyDziedziczenie;

public class Parrot extends Animal implements Herbivore {
    @Override
    public void eat(double weight) {
        this.weight += 1/2*weight;
    }


    @Override
    public void eatPlant(double weight) {
        eat(weight);
    }
}

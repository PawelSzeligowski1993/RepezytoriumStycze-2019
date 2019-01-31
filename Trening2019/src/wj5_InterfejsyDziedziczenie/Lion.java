package wj5_InterfejsyDziedziczenie;

public class Lion extends Animal implements Carnivore {
    @Override
    public void eat(double weight) {
        this.weight += 1/2*weight;
    }

    @Override
    public void eatCarnivore(double weight) {
        eat(weight);
    }
}
